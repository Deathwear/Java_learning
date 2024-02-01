package Backtracking;

public class Maze_AllDirection {
    public static void main(String[] args) {
        boolean[][] cells = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        Alldirection("", cells, 0, 0);
    }

    static void Alldirection(String p,boolean[][] maze, int row, int col){
        // Base condition
        if (row == maze.length-1 &&  col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        // condition of the restriction.
        if (!maze[row][col]){   // it means maze[row][col] == false.
            return;  // no further recursion is processed
        }

        // once the recursion is taking place, convert the boolean value of that cell as false
        maze[row][col] = false;

        //now performing all the four-direction recursion only when the boolean value is true.()
        //for Downwards
        if (row < maze.length - 1) {
            Alldirection(p + 'D', maze, row+1, col);
        }

        //for Right
        if (col < maze[0].length-1){
            Alldirection(p + 'R', maze, row, col+1);
        }

        // for Upwards
        if (row > 0){
            Alldirection(p + 'U', maze, row-1, col);
        }
        // for left
        if (col > 0){
            Alldirection(p + 'L', maze, row, col-1);
        }


        // when all the path values are returning, we are needed to reset the boolean value of every cell to its true for another brance of the recursion,
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][col] = true;

    }
}
