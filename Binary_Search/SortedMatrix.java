package Binary_Search;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }

    // performing binarySearch for all those four parts by passing their value in this method.
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) /2;
            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid +1;
            }else {
                cEnd = mid -1;
            }
        }
        return new int[]{-1,-1};
    }

    // main method for searching target in the matrix (it will pass the value to other methods)
    static int[] search(int[][] matrix, int target){
        // initializing rows and columns.
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, the matrix may be empty (gives the length of 1st row i.e., length of every row)

        if (rows == 1) {  // if the matrix have only one row then we will perform directly binarySearch i.e., 1-D array.
            return binarySearch(matrix, 0,0,cols-1, target);
        }

        // initializing starting & ending of row and its mid-column for performing search of the target.
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols /2;  // gives the middle column.

        // run the loop till two rows are remaining
        // performing binarySearch in 2-D array and reducing the search area w.r.t rows (in the end only two rows will be left)
        while(rStart < (rEnd -1)){ //while this is true, it will have more than 2 rows
            // initializing mid-index value from starting row to ending row (gives the middle row).
            int mid = rStart + (rEnd - rStart)/2;
            // when the middle element is the target directly print the answer.
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            // if target is greater than the middle element then look at the greater part by ignoring the lower valued rows.
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            // else ignore the higher valued rows by reducing the search area to from start row to mid-row.
            }else{
                rEnd =mid;
            }
            // by reducing the search area again and again, in the end, there will be only two rows left.
            // and then divide those two rows into four part w.r.t. middle column.
        }

        // now we have two rows;
        // check whether the target is in the column of 2 rows

        // checking in the middle column elements
        if (matrix[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart, cMid};
        }

        // search in the 1st half (upper right part)
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in the 2nd half (upper-left part)
        if (target <= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols-1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols -1, target);
        }
        // search in the 3rd half (lower right part)
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        }
        // search in the 4th half (lower left part)
        if (target <= matrix[rStart + 1][cMid + 1]) {
            return binarySearch(matrix, rStart+1, cMid + 1, cols -1, target);
        }
        return new int[]{-1,-1};
    }
}
