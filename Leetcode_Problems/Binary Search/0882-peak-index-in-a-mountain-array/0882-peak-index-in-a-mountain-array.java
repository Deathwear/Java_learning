// Using same approach of binary search 
class Solution0882 {
    public int peakIndexInMountainArray(int[] arr) {
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
        return end;   // we can also return  start here they both are equal at this point.
    }
    
}