package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
//        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            // base condition.
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)) ;
        int[] right= mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        // Taking a pointer for these three arrays (first, second & mix)
        int i = 0;  // index pointer for 1st array
        int j = 0;  // index pointer for 2nd (divided) arrays
        int k = 0;  // index pointer for a new array in which first and second are going to merge.


        while(i< first.length && j< second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete
        // copy the remaining elements.
        while (i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
// Original array is not modified indeed it returns the copy of array which is sorted.