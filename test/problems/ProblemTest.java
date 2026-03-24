package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {

    @Test
    @DisplayName("Every new problem should have a name")
    public void newProblemShouldHaveName(){
        Problem newProblem = new Problem("School Fees Debit", ProblemType.FINANCIAL);
        assertEquals("School Fees Debit", newProblem.getName());

    }
}
