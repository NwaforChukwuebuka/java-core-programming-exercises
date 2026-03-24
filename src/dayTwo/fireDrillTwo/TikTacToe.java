public class TikTacToe {
    public static void main(String[] args) {
        char[][] letters = {
                {'X', 'O', 'X'},
                {'X', 'X', 'O'},
                {'O', 'X', 'X'}
        };

        for (char[] row : letters) {
            for (char letter : row) {
                if (letter == 'X') {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }
    }
}
