class Solution704 {
    public int search(int[] nums, int target) {
        // declaring all pointers
        int start = 0;
        int end = nums.length-1;
        

        //uisng while loop for starting iteration 
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){  // given ascending order
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}