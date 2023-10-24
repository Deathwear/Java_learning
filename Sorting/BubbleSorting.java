package Sorting;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    // it will also check for an already-sorted array, but it will do the comparison as the worst case
    static void bubbleSorting(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            // If you didn't swap for a particular value of i, it means the array is sorted. Hence, stop the program, i.e., Break
            if (!swapped){ // !false == true; (if there isn't any swap occurred then break the loop and print the array i.e., no need to check again)
                break;
            }
        }
    }
}
