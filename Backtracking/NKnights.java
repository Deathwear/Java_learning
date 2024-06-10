package Backtracking;

public class NKnights {
    public static void main(String[] args) {
        // 5 knights in a 3X3 matrix.
        int n = 3;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 5);
    }

    static void knight(boolean[][] board, int row, int col, int knights){
        // Base condition:
        if (knights == 0){
            display(board);
            System.out.println();  // printing extra line when one matrix is printed.
            return;
        }

        // if col gets out of bound. then just skip it.
        if (row == board.length-1 && col == board.length){
            return;
        }

        // when we reach the end of the row, then we need to change the col to the next row.
        if (col == board.length){
            knight(board, row+1, 0, knights);
            return;
        }

        // check for whether we are needed to print the knight or not using isSafe method
        if (isSafe(board, row, col)){
            board[row][col] = true;
            knight(board, row, col +1, knights-1);
            board[row][col] = false; // Backtracking
        }
        // if it is not safe, then just move ahead the col.
        knight(board, row, col+1, knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        /* Check that four conditions of knight placement:
              1> row-2, col-1
              2> row-2, col+1
              3> row-1, col+2
              4> row-1, col-2
           we are needed to check for these four conditions.
           These are the places where knights can attack, therefore, we can't place another knight at that place.Therefore, we make those cells as false
        */
        if (isValid(board, row-2, col-1)){  // first, we are checking if it is valid or not, then we are going to check for the condition if satisfies then it is false.
            if (board[row-2][col-1]){
                return false;
            }
        }
        if (isValid(board, row-2, col+1)){
            if (board[row-2][col+1]){
                return false;
            }
        }
        if (isValid(board, row-1, col+2)){
            if (board[row-1][col+2]){
                return false;
            }
        }
        if (isValid(board, row-1, col-2)){
            if (board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }


    // checking whether it is out of bound. (created because do not repeat yourself.)
    static boolean isValid (boolean[][] board,  int row, int col){
        if (row>= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board){
            for (boolean element : row){
                if (element){
                    System.out.print("K ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();  // printing a new line for row change.
        }
    }
}