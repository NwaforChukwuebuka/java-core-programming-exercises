package weekFour.snacks;

public class MagicSquare {
    public static boolean GivenThreeByThreeArrays_AddRows_AddColumns_AddDiagonals_MustGiveSameNumber_ElseReturnFalse(int[][] array) {
        if (array.length != 3 || array[0].length != 3) {
            return false;
        }

        int sum = array[0][0] + array[0][1] + array[0][2];
        if (addRows(array, sum)) return false;
        if (addColumns(array, sum)) return false;
        if (addDiagonals(array, sum)) return false;
        return true;
    }

    private static boolean addRows(int[][] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            if (rowSum != sum) {
                return true;
            }
        }
        return false;
    }

    private static boolean addColumns(int[][] array, int sum) {
        for (int i = 0; i < array[0].length; i++) {
            int columnSum = 0;
            for (int j = 0; j < array.length; j++) {
                columnSum += array[j][i];
            }
            if (columnSum != sum) {
                return true;
            }
        }
        return false;
    }

     private static boolean addDiagonals(int[][] array, int sum) {
        int diagonalOneSum = 0;
        int diagonalTwoSum = 0;
        for (int i = 0; i < array.length; i++) {
            diagonalOneSum += array[i][i];
            diagonalTwoSum += array[i][array.length - 1 - i];
        }
        return diagonalOneSum != sum || diagonalTwoSum != sum;
     }
}
