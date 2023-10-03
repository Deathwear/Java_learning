class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = {-1, -1};
        // the value of first and last index is found here by calling search method
        int first = search(nums, target, true); //the search method will be called and ans is returned
        int last = search(nums, target, false); // the search method is called and ans is returned 
        output[0] = first;
        output[1] = last;
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