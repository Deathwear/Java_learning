package Binary_Search;

public class SearchInMountain {

    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = FindPeakElement(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // Now try to search in the second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }


    public int FindPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){  // loop will break when start = end (this is the peak point)
            int mid = start + (end - start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid +1;
            }else {  // when arr[mid] > arr[mid+1]
                end = mid;
            }
        }
        return end;   // we can also return start here they both are equal at this point.
    }


    static int orderAgnosticBS(int[] arr, int target, int start, int end){

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

// In leetcode just convert all array and their calls according to API as asked in question.

