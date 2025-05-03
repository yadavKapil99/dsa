package BackTracking;

public class NQueens {
    static int count = 0;  

    public static void main(String[] args) {
        int chessSize = 4;
        char board[][] = new char[chessSize][chessSize];

        // Initialize the board with 'X'
        for (int i = 0; i < chessSize; i++) {
            for (int j = 0; j < chessSize; j++) {
                board[i][j] = 'X';
            }
        }

        placeQueens(board, 0);

        System.out.println("Total number of possible chess boards: " + count);
    }

    public static boolean isCorrect(char board[][], int row, int col) {
        // Column check
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Left diagonal check
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Right diagonal check
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void placeQueens(char board[][], int row) {
        if (row == board.length) {
            System.out.println("------------ New Chess Board -------------");
            printBoard(board);
            count++;  
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isCorrect(board, row, j)) { 
                board[row][j] = 'Q';
                placeQueens(board, row + 1); 
                board[row][j] = 'X'; 
            }
        }
    }
}
