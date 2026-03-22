param(
  [Parameter(Mandatory = $true, Position = 0)]
  [string] $Name,

  [Parameter(ValueFromRemainingArguments = $true)]
  [string[]] $ProgramArgs
)

$ErrorActionPreference = "Stop"

function Fail([string] $Message, [int] $ExitCode = 1) {
  Write-Host $Message -ForegroundColor Red
  exit $ExitCode
}

function Find-JavaFile([string] $InputName) {
  $n = $InputName.Trim()
  if ([string]::IsNullOrWhiteSpace($n)) { Fail "Please provide a Java file name (example: TaskEight or day2\fireDrill2\TaskEight.java)." }

  $leaf = Split-Path -Leaf $n
  if ($leaf -match "\.class$") { $n = $n -replace "\.class$", ".java" }
  if ($leaf -notmatch "\.(java|class)$" -and $n -notmatch "\.java$") { $n = "$n.java" }

  # If user gave a path (relative or absolute), prefer it.
  if ($n -match "[\\/]" -or [System.IO.Path]::IsPathRooted($n)) {
    $candidate = Resolve-Path -LiteralPath $n -ErrorAction SilentlyContinue
    if ($candidate) { return $candidate.Path }
  }

  $baseName = [System.IO.Path]::GetFileNameWithoutExtension($n)
  $repoRoot = Resolve-Path -LiteralPath $PSScriptRoot
  $matches = @(Get-ChildItem -Path $repoRoot -Recurse -File -Filter "$baseName.java" -ErrorAction SilentlyContinue)

  if ($matches.Count -eq 0) { Fail "Couldn't find '$baseName.java' under '$($repoRoot.Path)'. Try giving a path like 'chapterTwo\$baseName.java'." }
  if ($matches.Count -gt 1) {
    Write-Host "Found multiple matches for '$baseName.java'. Please specify the path:" -ForegroundColor Yellow
    $matches | ForEach-Object { Write-Host ("- " + $_.FullName) }
    exit 2
  }

  return $matches[0].FullName
}

function Get-PackageName([string] $JavaFilePath) {
  $content = Get-Content -LiteralPath $JavaFilePath -Raw -ErrorAction Stop
  $m = [regex]::Match($content, "^\s*package\s+([A-Za-z_][\w\.]*)\s*;", [System.Text.RegularExpressions.RegexOptions]::Multiline)
  if ($m.Success) { return $m.Groups[1].Value }
  return $null
}

function Get-ClassPathRoot([string] $JavaFilePath, [string] $PackageName) {
  $dir = Split-Path -Parent $JavaFilePath
  if ([string]::IsNullOrWhiteSpace($PackageName)) { return (Resolve-Path -LiteralPath $dir).Path }

  $root = $dir
  $segments = $PackageName.Split(".")
  foreach ($seg in $segments) {
    $root = Split-Path -Parent $root
    if (-not $root) { break }
  }
  return (Resolve-Path -LiteralPath $root).Path
}

try {
  if (-not (Get-Command javac -ErrorAction SilentlyContinue)) { Fail "javac not found. Install a JDK and ensure 'javac' is on PATH." }
  if (-not (Get-Command java -ErrorAction SilentlyContinue)) { Fail "java not found. Install a JDK/JRE and ensure 'java' is on PATH." }

  $javaFile = Find-JavaFile $Name
  $className = [System.IO.Path]::GetFileNameWithoutExtension($javaFile)
  $packageName = Get-PackageName $javaFile
  $cpRoot = Get-ClassPathRoot $javaFile $packageName

  $fqcn = if ($packageName) { "$packageName.$className" } else { $className }
  $javaFileFromRoot = (Resolve-Path -LiteralPath $javaFile).Path.Substring($cpRoot.Length).TrimStart("\", "/")

  Push-Location -LiteralPath $cpRoot
  try {
    Write-Host "Compiling $javaFileFromRoot" -ForegroundColor Cyan
    & javac -d $cpRoot $javaFileFromRoot
    if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }

    Write-Host "Running $fqcn" -ForegroundColor Cyan
    if ($ProgramArgs) {
      & java -cp $cpRoot $fqcn @ProgramArgs
    } else {
      & java -cp $cpRoot $fqcn
    }
    exit $LASTEXITCODE
  }
  finally {
    Pop-Location
  }
}
catch {
  Fail $_.Exception.Message
}
