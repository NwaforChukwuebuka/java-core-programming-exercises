package weekThree.dayOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SlidingWindowAlgorithmTest {
    SlidingWindowAlgorithm slidingWindowAlgorithm;

    @BeforeEach
    void setUp() {
        slidingWindowAlgorithm = new SlidingWindowAlgorithm();
    }

    @Test
    void GivenArray_returnedArrayShouldBeTheMaximumSumOfSubArray() {
        int[] array = {1, 5, 6, 9, 3, 2};
        int k = 3;
        int[] expectedSubArray = {5, 6, 9};
        int[] actualSubArray = slidingWindowAlgorithm.findMaxSumSubArray(array, k);
        Assertions.assertArrayEquals(expectedSubArray, actualSubArray);
    }

    @Test
    void GivenAnotherArray_findMaxSumSubArray() {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int[] expectedSubArray = {5, 1, 3};
        int[] actualSubArray = slidingWindowAlgorithm.findMaxSumSubArray(array, k);
        Assertions.assertArrayEquals(expectedSubArray, actualSubArray);
    }

    @Test
    void GivenArraySizeLessThanK_returnEmptyArray() {
        int[] array = {1, 2};
        int k = 3;
        int[] expectedSubArray = {};
        int[] actualSubArray = slidingWindowAlgorithm.findMaxSumSubArray(array, k);
        Assertions.assertArrayEquals(expectedSubArray, actualSubArray);
    }
}
