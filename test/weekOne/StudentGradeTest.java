package weekOne;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {

    @Test
    void calculatePositions_returnsCorrectRanking() {
        int[] totals = {137, 216, 154, 227};
        int[] expectedPositions = {4, 2, 3, 1};
        assertArrayEquals(expectedPositions, StudentGrade.calculatePositions(totals));
    }

    @Test
    void studentGradeCalculations_matchSampleScenario() {
        int[][] testScores = {
            {67, 21, 49},
            {98, 62, 56},
            {93, 34, 27},
            {78, 83, 66}
        };
        StudentGrade.setScoresForTesting(testScores);
        assertDoesNotThrow(() -> {
            StudentGrade.displayClassSummary();
            StudentGrade.displaySubjectSummary();
            StudentGrade.displayOverallClassSummary();
        });
    }
}
