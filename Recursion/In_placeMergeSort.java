package Recursion;

import java.util.Arrays;

public class In_placeMergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
//        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int s, int e){
        if ( e - s == 1){
            // base condition.
            return;
        }
        int mid = (s+e)/2;

        mergeSortInPlace(arr, s, mid) ;
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e ){
        int[] mix = new int[e-s];

        // Taking a pointer for these three arrays (first, second & mix)
        int i = s;  // index pointer for 1st array
        int j = m;  // index pointer for 2nd (divided) arrays
        int k = 0;  // index pointer for a new array in which first and second are going to merge.


        while(i< m && j< e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not complete
        // copy the remaining elements.
        while (i< m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        // now you have answer in mix, now you have to copy the array in the original array.
        // we don't have to return it, so a method return type is void.

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
