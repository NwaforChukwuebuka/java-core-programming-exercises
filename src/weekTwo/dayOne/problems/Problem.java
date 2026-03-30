package weekTwo.dayOne.problems;

import weekTwo.dayOne.enums.ProblemType;

public class Problem {
    private String name;
    private ProblemType type;
    private boolean isSolved = false;

    public Problem(String name, ProblemType type) {
        this.name = name;
        this.type = type;

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

    public void solve() {
        this.isSolved = true;
    }
}
