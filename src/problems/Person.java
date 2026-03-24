package problems;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final List<Problem> problems = new ArrayList<>();

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

    public String recountUnsolvedProblems() {
        List<Problem> unsolvedProblems = getUnsolvedProblems();
        if (unsolvedProblems.isEmpty()) {
            return "No unsolved problems.";
        }

        String report = "";
        for (int index = 0; index < unsolvedProblems.size(); index++) {
            Problem problem = unsolvedProblems.get(index);
            report += (index + 1) + ". " + problem.getName() + " [" + problem.getType() + "]";

            if (index < unsolvedProblems.size() - 1) {
                report += System.lineSeparator();
            }
        }
        return report;
    }
}
