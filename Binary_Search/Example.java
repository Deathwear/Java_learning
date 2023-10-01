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

//            we can only do this if we know that array is in ascending order. otherwise we have to go for order agnostic BinarySearch
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;
            }
        }
        // this part will execute only when nothing is return from above or above condition are not met.
        System.out.println("-1 means element is not present in the array.");
        return -1;
    }
}


// We are using while loop in Binary search.
/*
here we have start and end indexes as start at 0  and end at arr.length-1
then we need to find the mid to divide the array in half
then check for if target>mid in ascending order means it is on the right side then we need to shift the start value and check again for the same process
or else if target<mid then it means that it is on the left side of the mid-value then we need to shift the end index to mid-1
else if target = mid then we return the ans
or keep repeating the steps until target== mid-index value, and it will return the index value of the target.
 */