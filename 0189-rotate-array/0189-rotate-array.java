class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        
        // Handle cases where k is greater than the array length
        k = k % n;
        
        // Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }
    
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}