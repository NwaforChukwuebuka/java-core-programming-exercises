package ChapterTen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorsTest {

    @Test
    @DisplayName("getFactors returns factors of 20 excluding 1")
    public void shouldReturnFactorsOf20ExcludingOne(){
        List<Integer> factors = Factor.getFactors(20);
        assertEquals(List.of(2, 4, 5, 10, 20), factors);
    }

    @Test
    @DisplayName("getFactors returns factors of 30 excluding 1")
    public void shouldReturnFactorsOf30ExcludingOne(){
        int number = 30;
        List<Integer> factors = Factor.getFactors(number);
        assertEquals(List.of(2, 3, 5, 6, 10, 15, 30), factors);
    }

    @Test
    @DisplayName("getFactors of 1 should be empty when 1 is excluded")
    public void shouldReturnEmptyListForOne(){
        List<Integer> factors = Factor.getFactors(1);
        assertEquals(List.of(), factors);
    }

}
