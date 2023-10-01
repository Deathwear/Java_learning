// find the ceiling of the 17 in the given array.
package Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        // We know that array is sorted in increasing order.
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.print("Index of ceiling value of our target is: ");
        System.out.println(ans);
    }
    //      return the index of smallest number >= target.
    static int ceiling(int[] arr, int target){
        // what if the target is greatest among all the elements in that array (there is no ceiling)
        if (target > arr[arr.length-1]) {
            return -1; // -1 indicates the ceiling of that number is not present in the array.
        }
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
        return start;
    }


}

/*
here, we are trying to find out the ceiling of the target present in the array
we have given a sorted array
we need to find the smallest number >= target;
for that we are using binary search
and if that target != mid (means not present in the array)
the while loop terminates and start will be returned;


to understand this, start iterating the binary search
if target == mid; means target is present and return the target
else: if target is not present the iteration will terminate when start>= end (while loop terminates here)
after that start is returned, because it will be the smallest lager value than the target and end will be the smaller than target
hence, we are needed to find the smallest value greater than target would be the start; (when target != mid)

start, end, mid are the reference pointer here.

 */
