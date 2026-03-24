package problems;

import java.util.ArrayList;
import java.util.List;

public class Person {

    List<Problem> problems = new ArrayList<>();

    public List<Problem> getUnsolvedProblems() {
        return  problems;
    }


    public void addProblem(Problem newProblem) {
        problems.add(newProblem);
    }
}
