package weekFour.snacks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MagicSquareTest {

    @Test
    public void testValidMagicSquareReturnsTrue() {
        int[][] magicSquare = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };
        assertTrue(MagicSquare.GivenThreeByThreeArrays_AddRows_AddColumns_AddDiagonals_MustGiveSameNumber_ElseReturnFalse(magicSquare));
    }

    @Test
    public void testInvalidMagicSquareRowsReturnsFalse() {
        int[][] invalidSquare = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 3}
        };
        assertFalse(MagicSquare.GivenThreeByThreeArrays_AddRows_AddColumns_AddDiagonals_MustGiveSameNumber_ElseReturnFalse(invalidSquare));
    }

    @Test
    public void testInvalidMagicSquareColumnsReturnsFalse() {
        int[][] invalidSquare = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 8, 2}
        };
        assertFalse(MagicSquare.GivenThreeByThreeArrays_AddRows_AddColumns_AddDiagonals_MustGiveSameNumber_ElseReturnFalse(invalidSquare));
    }

    @Test
    public void testInvalidMagicSquareDiagonalTwoSpecificallyFails() {
        
        int[][] diagTwoInvalid = {
            {1, 3, 6},
            {7, 4, -1},
            {2, 3, 5}
        };
        assertFalse(MagicSquare.GivenThreeByThreeArrays_AddRows_AddColumns_AddDiagonals_MustGiveSameNumber_ElseReturnFalse(diagTwoInvalid));
    }
    @Test
    public void testNon3x3ArrayReturnsFalse() {
        int[][] nonSquare = {
            {1, 2},
            {3, 4}
        };
        assertFalse(MagicSquare.GivenThreeByThreeArrays_AddRows_AddColumns_AddDiagonals_MustGiveSameNumber_ElseReturnFalse(nonSquare));
        
        int[][] rect = {
            {1, 2, 3},
            {4, 5, 6}
        };
        assertFalse(MagicSquare.GivenThreeByThreeArrays_AddRows_AddColumns_AddDiagonals_MustGiveSameNumber_ElseReturnFalse(rect));
    }
}
