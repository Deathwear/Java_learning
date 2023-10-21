package Binary_Search;

// Finding a target in 2-D array. (Matrix is sorted in row wise & column wise)
/* WORKING:
            First make a search method
            in this search method, we pass the array and target and start searching for it
            in this method, we initialized row at 0th row and column at last column
            then by taking the last element of each row  and comparing it with the target (bcz it is only sorted in a row)
            if that element == target; (then we found our target)
            elseif, target > that element; then we have to look for the greater part of the array (means ignoring the smaller part)
            we have to do row++ (it will present in that row)
            else (i.e. target<that element) we do col-- (bcz matrix is also sorted column wise) means that target is not present in that column


            that's how we are decreasing our search area every time by column and row until we find the target.
 */

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}

        };

        System.out.println(Arrays.toString(search(arr,37)));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length -1;

        while(r< matrix.length && c >=0){
            if (matrix[r][c] == target) {
                return new int[]{r,c};
            }
            if (matrix[r][c] < target) {
                r++;
            }else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
