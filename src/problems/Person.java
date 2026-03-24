package problems;

import java.util.ArrayList;
import java.util.List;

public class Person {

    List<Problem> problems = new ArrayList<>();

    public List<Problem> getUnsolvedProblems() {
        List<Problem> unsolvedProblemList = new ArrayList<>();
        for(Problem problem: problems){
            if(problem.isSolved() == false) {
                unsolvedProblemList.add(problem);
            }
        }
        return unsolvedProblemList;
    }


    public void addProblem(Problem newProblem) {
        problems.add(newProblem);
    }

    public void solveProblem(Problem problem) {
        problem.solve();
    }
}
