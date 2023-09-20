package Linear_Search;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int target = 34;
        int[] ans = search(arr, target); // format of return value will be like {row, col}
        System.out.println(Arrays.toString(ans));    
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}

// this will give the row and column of the target in our 2D Array.