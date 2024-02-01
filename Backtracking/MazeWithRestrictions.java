package Backtracking;

public class MazeWithRestrictions {
    public static void main(String[] args) {
        boolean[][] rest = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("", rest, 0, 0);
    }

    static void pathRestrictions(String p, boolean[][] maze , int row, int col){
        if (row == maze.length-1 &&  col == maze[0].length-1) {
            System.out.println(p);
            return;
        }

        // condition of the restriction.
        if (!maze[row][col]){   // it means maze[row][col] == false.
            return;  // no further recursion is processed
        }

        if (row < maze.length-1) {
            pathRestrictions(p + 'D', maze, row+1, col);  // adding character D in the processed string
        }
        if (col < maze[0].length-1) {
            pathRestrictions(p + 'R', maze,  row, col+1);  // adding character R in the processed string.
        }


    }
}
