package weekFour.snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAlgorithmTest {

    @Test
    public void testGivenAnArray_SortInPlaceWithoutDefiningTempVariable() {
        int[] array = {5, 3, 8, 4, 2};
        SortAlgorithm.GivenAnArray_SortInPlaceWithoutDefiningTempVariable(array);
        int[] expected = {2, 3, 4, 5, 8};
        assertArrayEquals(expected, array);
    }
}
