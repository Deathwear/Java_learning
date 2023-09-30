package Binary_Search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // Here, We don't know that array is sorted in increasing order or decreasing order.
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.print("The index value of the target is: ");
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start]<arr[end];  //return true if it is in ascending order.


//        check only till start == end. after that -1 is returned means target value is not present in the array
        while (start <= end){
            //find the middle element
//            int mid= (start + end) /2; // might be possible that (start + end) exceeds the range of integer in java
            int mid = start + (end - start) / 2;  //this will fit easily in the integer limit of java

            if (arr[mid] == target) {
            return mid;
            }

            if(isAsc) {  // for true value means for an ascending array.
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {  // for false boolean value means for descending array.
                if (target > arr[mid]) {
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
/*
here we have used boolean value for if it is ascending or not
if this is true, then it means it is ascending
if it is false, then it means it is descending

for true, we will code for an ascending array by changing the index value of start and end accordingly.
and for false, we will code for a descending array by changing the index value of start and end accordingly.

then we will code similar to example.java, but we have to write code for both ascending and descending.


 */