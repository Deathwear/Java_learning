// printing all the possible path in a 3x3 maze using only down and right.

package Backtracking;

import java.util.ArrayList;

public class MazePrintingPath {
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println(pathList("", 3, 3));
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


    // add all the paths in an ArrayList.
    static ArrayList<String> pathList(String p, int row, int col) {
        if (row == 1 && col == 1) { // Base condition.
            // create a new arraylist and add all processed values in it.
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (row > 1) {
            list.addAll(pathList(p + 'D', row - 1, col));
        }

        if (col > 1) {
            list.addAll(pathList(p + 'R', row, col - 1));
        }


        return list;
    }
}
