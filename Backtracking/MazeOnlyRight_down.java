// possible ways of moving from one point to another using oly right and down

package Backtracking;

public class MazeOnlyRight_down {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    static int count(int row, int col){
        if (row == 1 || col == 1) {
            return 1;
        }

        int right = count(row, col-1);  // if man moves right then row will be decreased
        int down = count(row-1, col);   // if man moves down then col will be reduced

        return right + down;
    }
}

// We will use dynamic programming concept in the future for this type of questions.