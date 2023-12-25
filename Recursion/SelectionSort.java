package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c, int max){
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] >= arr[max]){
                selection(arr, r, c+1, c);   // here c becomes the max
            }else {
                selection(arr, r, c+1, max);
            }
        } else {  // means we have got our max already
            // swapping the max to the last position of the array.
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;

            selection(arr, r-1, 0, 0);  // then it will do the same thing
        }
    }
}
