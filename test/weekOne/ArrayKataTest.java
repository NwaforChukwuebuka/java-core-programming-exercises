package weekOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayKataTest {

    private ArrayKata arrayKata;

    @BeforeEach
    void setUp() {
        arrayKata = new ArrayKata();
    }

    @Test
    void maximumIn_returnsLargestElement() {
        int[] numbers = {1, 5, 3, 9, 2};
        assertEquals(9, arrayKata.maximumIn(numbers));
    }

    @Test
    void minimumIn_returnsSmallestElement() {
        int[] numbers = {1, 5, 3, 9, 2};
        assertEquals(1, arrayKata.minimumIn(numbers));
    }

    @Test
    void sumOf_returnsSumOfElements() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, arrayKata.sumOf(numbers));
    }

    @Test
    void sumOfEvenNumbersIn_returnsSumOfEvens() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(12, arrayKata.sumOfEvenNumbersIn(numbers));
    }

    @Test
    void sumOfOddNumbersIn_returnsSumOfOdds() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        assertEquals(9, arrayKata.sumOfOddNumbersIn(numbers));
    }

    @Test
    void maximumAndMinimumOf_returnsMinAndMaxArray() {
        int[] numbers = {10, 5, 8, 20, 3};
        int[] expected = {3, 20};
        assertArrayEquals(expected, arrayKata.maximumAndMinimumOf(numbers));
    }

    @Test
    void noOfOddNumbersIn_returnsCountOfOdds() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(3, arrayKata.noOfOddNumbersIn(numbers));
    }

    @Test
    void noOfEvenNumbersIn_returnsCountOfEvens() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(2, arrayKata.noOfEvenNumbersIn(numbers));
    }

    @Test
    void evenNumbersIn_returnsArrayOfEvens() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 4, 6};
        assertArrayEquals(expected, arrayKata.evenNumbersIn(numbers));
    }

    @Test
    void oddNumbersIn_returnsArrayOfOdds() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 3, 5};
        assertArrayEquals(expected, arrayKata.oddNumbersIn(numbers));
    }

    @Test
    void squareNumbersIn_returnsArrayOfSquares() {
        int[] numbers = {1, 2, 4, 8, 9, 16, 20, 25};
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, arrayKata.squareNumbersIn(numbers));
    }
}
