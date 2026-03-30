package weekOne;

public class Kata {

    public boolean isEven(int integer) {
        return integer % 2 == 0;
    }

    public boolean isPrimeNumber(int integer) {
        if (integer <= 1) return false;
        for (int i = 2; i <= Math.sqrt(integer); i++) {
            if (integer % i == 0) return false;
        }
        return true;
    }

    public int subtract(int first, int second) {
        return Math.abs(first - second);
    }

    public float divide(int first, int second) {
        if (second == 0) return 0;
        return (float) first / second;
    }

    public int factorOf(int integer) {
        int count = 0;
        for (int i = 1; i <= Math.abs(integer); i++) {
            if (integer % i == 0) count++;
        }
        return count;
    }

    public boolean isSquare(int integer) {
        if (integer < 0) return false;
        int root = (int) Math.sqrt(integer);
        return root * root == integer;
    }

    public boolean isPalindrome(int integer) {
        String s = String.valueOf(integer);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public long factorialOf(int integer) {
        if (integer < 0) return 0; // Or throw exception, but 0 is safe-ish for this context
        long factorial = 1;
        for (int i = 1; i <= integer; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public long squareOf(int integer) {
        return (long) integer * integer;
    }
}
