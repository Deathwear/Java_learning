package Leetcode_Problems.Arrays;

/* 1480. Running Sum of 1d Array
    problem statement: Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
    Return the running sum of nums.

    solution:
    int sum = 0;
    here we can use for loop as->  for(int i = 1; i<arr.length; i++){
                                        sum[i] = sum[i-1] + arr[i]; //not applicable for 0th index bcz sum[0-1] = -1 gives an error;
                                   }
                                return sum;

   we will get the running sum with this for eg: 3rd index sum would be 2nd index of sum + 3rd index of array;

 */
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // nums[0] = nums[0];
            nums[i] = nums[i-1] + nums[i];
        }
    return nums;
    }
}