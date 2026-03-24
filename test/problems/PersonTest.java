package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    @DisplayName("New Person should have no problem")
    public void newPersonShouldNotHaveProblem(){
        Person newPerson = new Person();
        assertTrue(newPerson.getUnsolvedProblems().isEmpty());
    }

    @Test
    @DisplayName("Person can add problems")
    public void personCanAddProblem(){
        Person newPerson = new Person();
        Problem newProblem = new Problem("School Fees", ProblemType.FINANCIAL);
        newPerson.addProblem(newProblem);
        assertEquals(1, newPerson.getUnsolvedProblems().size());
    }

    @Test
    @DisplayName("Solved problem should not appear in unsolved problems")
    public void solvedProblemShouldNotBeReturned() {
        Person newPerson = new Person();

        Problem newProblem = new Problem("School Fees", ProblemType.FINANCIAL);
        newPerson.addProblem(newProblem);
        newProblem.solve();
        assertTrue(newPerson.getUnsolvedProblems().isEmpty());
    }

    @Test
    @DisplayName("Person can solve problems")
    public void PersonCanSolveProblem(){
        Person newPerson = new Person();

        Problem newProblem = new Problem("School Fees", ProblemType.FINANCIAL);

        newPerson.addProblem(newProblem);
        newPerson.solveProblem(newProblem);
        assertTrue(newPerson.getUnsolvedProblems().isEmpty());
    }
}
