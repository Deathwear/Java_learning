package Backtracking;

import java.util.ArrayList;

public class MazeWithDiagonal{
    public static void main(String[] args) {
        path("", 3, 3);
        System.out.println(pathList("", 3, 3));
        System.out.println(count(3, 3));
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
        if (row>1 && col>1){
            path(p + 'd', row-1, col-1);  // small d represents diagonal.
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

        ArrayList<String> list = new ArrayList<>();  // formed inside the body so every recursion call will have that list
        if (row > 1) {
            list.addAll(pathList(p + 'D', row - 1, col));
        }

        if (col > 1) {
            list.addAll(pathList(p + 'R', row, col - 1));
        }
        if (col>1 && row>1){
            list.addAll(pathList(p+ 'd', row-1, col-1));
        }


        return list;
    }

    // counting the number of possible paths.
    static int count(int row, int col){
        if (row == 1 || col == 1) {
            return 1;
        }

        int right = count(row, col-1);  // if man moves right then row will be decreased
        int down = count(row-1, col);   // if man moves down then col will be reduced
        int diagonal = count(row-1, col-1);
        return right + down + diagonal;
    }


}
