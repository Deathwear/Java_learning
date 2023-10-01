// find the floor of the target value present in the array.

package Binary_Search;

public class Floor {
    public static void main(String[] args) {
        // We know that array is sorted in increasing order.
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.print("Index of floor value of our target is: ");
        System.out.println(ans);
    }
    //      return the index of largest number <= target.
    static int floor(int[] arr, int target){
        // What if the target is the smallest no than whole elements present in the array
//        if (target < arr[1]) {
//            return -1; // means a floor of that no. Is not present in the array.
//        } // No need to write this code because in the end, an end pointer will also become -1 (that's why haha)
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
        return end;
    }
}
