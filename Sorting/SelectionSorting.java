package Sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in the remaining array and swap with correct index.
            int last = arr.length - i- 1;  // last index where to place the largest element for that
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
