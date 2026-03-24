package problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    @DisplayName("New Person should have no problem")
    public void newPersonShouldNotHaveProblem(){
        Person newPerson = new Person();
        assertTrue(newPerson.getUnsolvedProblems().isEmpty());
    }
}
