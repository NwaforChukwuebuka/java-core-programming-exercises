package weekOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    private final Kata kata = new Kata();

    @Test
    void isEven_returnsTrueForEvenIntegers() {
        assertTrue(kata.isEven(2));
        assertTrue(kata.isEven(0));
        assertTrue(kata.isEven(-4));
    }

    @Test
    void isPrimeNumber_returnsTrueForPrimes() {
        assertTrue(kata.isPrimeNumber(2));
        assertTrue(kata.isPrimeNumber(3));
        assertFalse(kata.isPrimeNumber(1));
    }

    @Test
    void subtract_returnsAbsoluteDifference() {
        assertEquals(4, kata.subtract(3, 7));
        assertEquals(4, kata.subtract(7, 3));
        assertEquals(0, kata.subtract(5, 5));
        assertEquals(10, kata.subtract(-5, 5));
        assertEquals(10, kata.subtract(5, -5));
    }

    @Test
    void divide_returnsQuotient() {
        assertEquals(2.5f, kata.divide(5, 2));
        assertEquals(2.0f, kata.divide(10, 5));
        assertEquals(0.0f, kata.divide(10, 0));
        assertEquals(0.5f, kata.divide(1, 2));
    }

    @Test
    void factorOf_returnsNumberOfFactors() {
        assertEquals(4, kata.factorOf(10));
        assertEquals(2, kata.factorOf(7));
    }

    @Test
    void isSquare_returnsTrueForSquareNumbers() {
        assertTrue(kata.isSquare(25));
        assertTrue(kata.isSquare(4));
    }

    @Test
    void isPalindrome_returnsTrueForFiveDigitPalindrome() {
        assertTrue(kata.isPalindrome(54145));
    }

    @Test
    void factorialOf_returnsFactorial() {
        assertEquals(120, kata.factorialOf(5));
        assertEquals(1, kata.factorialOf(0));
        assertEquals(1, kata.factorialOf(1));
    }

    @Test
    void squareOf_returnsSquare() {
        assertEquals(25, kata.squareOf(5));
        assertEquals(0, kata.squareOf(0));
        assertEquals(1, kata.squareOf(1));
    }
}
