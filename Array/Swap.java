package Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 9, 18};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println("The original Array was different the 1st & 3rd index values are swapped using swap method.");
    }

    // creating swap method that is used in psvm.
    static void  swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    
        
    }
    
}
