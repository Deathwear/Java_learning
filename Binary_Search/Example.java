package Binary_Search;

public class Example {
    public static void main(String[] args) {
        // We know that array is sorted in increasing order.
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.print("Index point of our target is: ");
        System.out.println(ans);
    }

    //return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            //find the middle element
//            int mid= (start + end) /2; // might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;  //this will fit easily in the integer limit of java

            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}


// We are using while loop in Binary search.