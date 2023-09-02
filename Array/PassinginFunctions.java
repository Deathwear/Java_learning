package Array;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int [] nums = {3, 4, 5, 7};
        System.out.println(Arrays.toString(nums));
        change(nums); //calling the method be change as named in the method
        System.out.println(Arrays.toString(nums)); // printing the array after the change method
    } // here mutable behaviour applies as the original array also changes after applying method.
    static void change(int[] arr){
        arr[0] = 99;
    }
}

// Therefore we can conclude that:
// String are immutable in java. (We will look for that in string module)
// Arrays are mutable in java.
