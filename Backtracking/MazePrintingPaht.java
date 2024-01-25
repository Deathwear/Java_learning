// printing all the possible path in a 3x3 maze using only down and right.

package Backtracking;

public class MazePrintingPaht {
    public static void main(String[] args) {
        path("", 3, 3);
    }

    static void path(String p, int row, int col){
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            path(p + 'D', row-1, col);  // adding character D in the processed string
        }
        if (col > 1) {
            path(p + 'R', row, col-1);  // adding character R in the processed string.
        }
    }
}
