class Solution {
    public int findPeakElement(int[] nums) {
                int start = 0;
        int end = nums.length-1;

        while(start<end){  // loop will break when start = end (this is the peak point)
            int mid = start + (end - start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid +1;
            }else {  // when arr[mid] > arr[mid+1]
                end = mid;
            }
        }
        return end;   // we can also return  start here they both are equal at this point.
    }
    
}

// sollution is same as ques no. 852 (Finding Peak index in a Moutain Array)  -Leetcode