public class Nqueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }

        }

        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }

        }

        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }

        }

        return true;
    }

    public static void nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
           printBoard(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    public static void printBoard(char board[][]) {

        System.out.println("-----------chess Board-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        //initialize
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] ='x';
            }
        }
        nQueens(board, 0);
          System.out.println("The stotal ways of solving NQueen is equals to : " + count);
    }
}
