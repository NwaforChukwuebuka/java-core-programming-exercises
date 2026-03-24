package problems;

public class Problem {
    private String name;
    private ProblemType type;
    private boolean isSolved = false;

    public Problem(String name, ProblemType type, boolean isSolved) {
        this.name = name;
        this.type = type;
        this.isSolved = isSolved;

    }

    public String getName() {
        return  name;
    }

    public ProblemType getType() {
        return type;
    }

    public boolean isSolved() {
        return isSolved;
    }
}
