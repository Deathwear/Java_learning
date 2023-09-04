package Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 9, 18};
        swap(arr, 1, 3);
        System.out.print("Array after swapping 1st & 3rd index value: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Reversed Array: ");
        //here we have reversed the swapped array not the original array.
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // creating swap method that is used in psvm.
    static void  swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    
        
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        } // works both for even no. of array and odd no. of arrays
        // we are using two pointer here.
    }
    
}
