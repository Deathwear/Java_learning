package Array;


public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.print("Max element in the whole array: ");
        System.out.println(max(arr));
        System.out.print("Max element in the range of 1st to 3rd index value: ");
        System.out.println(maxRange(arr,1, 3)); //here start and end will take from index value.
    }

    // imagine that array is not empty.
    public static int max(int[] arr) {
        //if the array is empty
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            //no need of else bcz maxVal will remain same
        }
        return maxVal;
    }


    // maximum value in a range:
    public static int maxRange(int[] arr, int start, int end) {
        //work on edge cases here, like array being null
        if (arr == null) {
            return -1;
        }
        if (end > start) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }// Index value will be considered in place of start and end.
            //no need of else bcz maxVal will remain same
        }
        return maxVal;
    }

}
/*
iterate over an array by assuming anyone max item and then compare and update them accordingly.
 */


