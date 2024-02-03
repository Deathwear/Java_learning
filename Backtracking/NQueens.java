package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row){
        // when we come to the last row, and it is placed means this is what we wanted and this is one of our possible solutions.
        if (row == board.length){
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and column
        for (int col =0; col< board.length; col++){
            // place the queen if it is true. (means if it is safe)
            if (isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;  // reset (backtracking)
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        // check diagonal right
        int maxRight = Math.min(row, board.length- col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }


    // method to display queens position in a matrix
    private static void display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){  // if true print Q else for false print X
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
