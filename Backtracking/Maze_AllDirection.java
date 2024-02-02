package Backtracking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Maze_AllDirection {
    public static void main(String[] args) {
        boolean[][] cells = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        Alldirection("", cells, 0, 0);
        System.out.println();
        int[][] path = new int[cells.length][cells[0].length];  // specifying dimension of the path
        AlldirectionPrint("", cells, 0, 0, path, 1);
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



    static void AlldirectionPrint(String p,boolean[][] maze, int row, int col, int[][] path, int step){
        // Base condition
        if (row == maze.length-1 &&  col == maze[0].length-1){
            path[row][col] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        // condition of the restriction.
        if (!maze[row][col]){   // it means maze[row][col] == false.
            return;  // no further recursion is processed
        }

        // once the recursion is taking place, convert the boolean value of that cell as false
        maze[row][col] = false;
        path[row][col] = step;
        //now performing all the four-direction recursion only when the boolean value is true.()
        //for Downwards
        if (row < maze.length - 1) {
            AlldirectionPrint(p + 'D', maze, row+1, col, path, step+1);
        }
        //for Right
        if (col < maze[0].length-1){
            AlldirectionPrint(p + 'R', maze, row, col+1, path, step+1);
        }
        // for Upwards
        if (row > 0){
            AlldirectionPrint(p + 'U', maze, row-1, col, path, step+1);
        }
        // for left
        if (col > 0){
            AlldirectionPrint(p + 'L', maze, row, col-1, path, step+1);
        }

        // when all the path values are returning, we are needed to reset the boolean value of every cell to its true for another brance of the recursion,
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][col] = true;
        path[row][col] = 0;

    }
}
