package weekFour.snacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideAlgorithmTest {

    @Test
    public void testDivideAlgorithm() {
        int result = DivideAlgorithm.GivenTwoNumbers_DivideFirstBySecond_WithoutUsingDivisorOperator_DivsiorMustBeGreaterThanOne(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideAlgorithmWithNegativeDivisor() {
        int result = DivideAlgorithm.GivenTwoNumbers_DivideFirstBySecond_WithoutUsingDivisorOperator_DivsiorMustBeGreaterThanOne(-10, 2);
        assertEquals(-5, result);
    }
    @Test
    public void testDivideAlgorithmWithZeroDivisor() {
        int result = DivideAlgorithm.GivenTwoNumbers_DivideFirstBySecond_WithoutUsingDivisorOperator_DivsiorMustBeGreaterThanOne(10, 0);
        assertEquals(0, result);
    }
    @Test
    public void testDivideAlgorithmWithZeroDividend() {
        int result = DivideAlgorithm.GivenTwoNumbers_DivideFirstBySecond_WithoutUsingDivisorOperator_DivsiorMustBeGreaterThanOne(0, 10);
        assertEquals(0, result);
    }
    @Test
    public void testDivideAlgorithmWithNegativeDividend() {
        int result = DivideAlgorithm.GivenTwoNumbers_DivideFirstBySecond_WithoutUsingDivisorOperator_DivsiorMustBeGreaterThanOne(-10, -2);
        assertEquals(5, result);
    }
}
