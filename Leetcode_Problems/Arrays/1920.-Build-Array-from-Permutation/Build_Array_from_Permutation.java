package Leetcode_Problems.Arrays;

//Sollution from here
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans =new int[nums.length];
        int i=0;
        while(i<nums.length){
            ans[i] =nums[nums[i]];
            i++;
        }
        return ans;
    }
}
