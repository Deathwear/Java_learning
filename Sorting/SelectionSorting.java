package Sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSorting(int[] arr){
        // here we have decided our search area,
        // which will get reduced after every iteration of maxValue to the last index.
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in the remaining array and swap with the correct index.
            int last = arr.length - i- 1;  // last index where to place the largest element for that
            int maxIndex = getMaxIndex(arr, 0, last);  // here last is the end value
            swap(arr, maxIndex, last);    // we get the max value in our searching area, and we need to replace it to the last position, therefore we are needed to swap the maxIndex value with the last position of Scope area.
        }
    }

    // Function for swapping the maxValue element(i.e., int first) with the second value element (i.e., the last position of our search area)
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

/*
In selection sort, we are needed to select the highest value of an element in our array and put it on the last index value
and reduce our search area and then repeat the process till the whole array is sorted.

 */
