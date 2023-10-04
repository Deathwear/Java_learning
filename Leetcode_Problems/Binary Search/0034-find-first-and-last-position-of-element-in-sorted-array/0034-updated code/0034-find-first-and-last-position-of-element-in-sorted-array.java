class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = {-1, -1};
        // the value of first and last index is found here by calling search method
        output [0] = search(nums, target, true); //the search method will be called and returns output.
        if (output[0] != -1){  // will check for last occurance only when there is first occurance.
            output [1] = search(nums, target, false); 
        }
        return output;
    }

    public int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = start + (end-start)/2;
            // given that array is sorted ascending
            if (target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                // potential answer is found but now need to look for the first and last occurances.
                ans = mid;
                if(findStartIndex){
                    end = mid -1; // I am looking for first occurance in this. 
                }else{
                    start = mid + 1; // I am looking for last occurance in this.
                }
            }
        }
        return ans;
    }
}