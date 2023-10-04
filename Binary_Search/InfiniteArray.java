package Binary_Search;
// asked in Amazon Interview <taken from Geeks-for-Geeks>
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));  //printing answer by giving arr and target using ans method
    }
    static int ans(int[] arr, int target){
        // finding range
        // first start with the size of 2
        int start = 0;
        int end = 1;  // they are reflecting the index value of start and end.

        // condition for the target to lie in the range.
        // => if target is greater than end then, of course target will not lie in that Range.
        // we will keep doubling the size while my target is greater than an end, bcz target will not lie in the Range if it is greater than end.
        while (target > arr[end]){
            int newStart = end +1;  // this is my new start
            // double the range: end + range * 2
            // Range = end - start + 1 (this is the range & we need to double it every time.)
            end = end + (end - start + 1) * 2;  // here I am using old start (that's why needed to declare new start earlier)
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);  // this will returnn the start, end, arr, and target for the answer each time in the while loop
        // until we find the correct RAnge where our target lies this while loop will  using to find the range where our target exist only then it will return the start and end
        // and then that start and end (only where our target exist) will go to  the BinarySearch method to find the target
    }
    //using method of binary search
    static int BinarySearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return mid;  // this will return the index value as ans
            }
        }
        return -1; // means target is not present
    }
}

/* what we are needed to change in this:
 declare the range for start and end after every while loops break, we need to double the range and start the procedure again till we find that our target lies inside the range and pass that range only for binary search
 we are needed to pass the start and end in the binary search method where our target lies.
=> if target is greater than end then, of course target will not lie in that Range.







 */