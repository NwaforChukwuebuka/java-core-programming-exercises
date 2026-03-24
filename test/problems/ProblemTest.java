package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {

    @Test
    @DisplayName("Every new problem should have a name")
    public void newProblemShouldHaveName(){
        Problem newProblem = new Problem("School Fees Debit", ProblemType.FINANCIAL, false);
        assertEquals("School Fees Debit", newProblem.getName());
    }

    @Test
    @DisplayName("Every new problem should have type")
    public void newProblemShouldHaveType(){
        Problem newProblem = new Problem("School Fees Debit", ProblemType.FINANCIAL, false);
        assertEquals(ProblemType.FINANCIAL, newProblem.getType());
    }


    @Test
    @DisplayName("Every new problem should not be solved")
    public void newProblemShouldNotBeSolved(){
        Problem newProblem = new Problem("School Fees Debit", ProblemType.FINANCIAL, false);
        assertEquals(false,newProblem.isSolved());
    }

}
