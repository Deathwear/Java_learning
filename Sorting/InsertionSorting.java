package Sorting;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5};
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Insertion Sorting technique for sorting array
    public static void insertionSorting(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {  // (i will run till length-2)
            // j is starting after ith position, moving backwards by comparing and replacing them. if it is bigger value then it breaks because previous elements are already sorted by it (it has started from the beginning and already checked it) i.e., started from comparing zero at the very beginning.
            for (int j = i+1; j >0; j--) {   // j will run till 0th index i.e., j>0 will be comapred with j at 0th index at the last
                if (arr[j] < arr[j-1]) {
                    swap(arr, j , j-1);
                }else{  // You can debug and check for this part.
                    break;  // If previous elements are already sorted then no need to check for them because we are already checking them from beginning. Therefore, we are using break here
                }
            }
        }
    }

    // Normal swap function for swapping lower values to previous positions.
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
