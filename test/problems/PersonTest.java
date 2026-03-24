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

    @Test
    @DisplayName("Add two problems, solve one, one remains unsolved")
    public void AddTwoProblemsRemoveOne() {
        Person person = new Person();

        Problem problem1 = new Problem("School Fees", ProblemType.FINANCIAL);
        Problem problem2 = new Problem("Exam Prep", ProblemType.EDUCATION);
        person.addProblem(problem1);
        person.addProblem(problem2);
        person.solveProblem(problem1);
        assertEquals(1, person.getUnsolvedProblems().size());
        assertEquals("Exam Prep", person.getUnsolvedProblems().get(0).getName());
    }

    @Test
    @DisplayName("Person can recount unsolved problems")
    public void personCanRecountUnsolvedProblems() {
        Person person = new Person();
        person.addProblem(new Problem("School Fees", ProblemType.FINANCIAL));
        person.addProblem(new Problem("Exam Prep", ProblemType.EDUCATION));

        String recount = person.recountUnsolvedProblems();
        assertTrue(recount.contains("School Fees"));
        assertTrue(recount.contains("Exam Prep"));
    }

    @Test
    @DisplayName("Person recount should return no unsolved problems message")
    public void recountShouldShowNoUnsolvedProblemsWhenAllSolved() {
        Person person = new Person();
        Problem problem = new Problem("School Fees", ProblemType.FINANCIAL);
        person.addProblem(problem);
        person.solveProblem(problem);

        assertEquals("No unsolved problems.", person.recountUnsolvedProblems());
    }
}
