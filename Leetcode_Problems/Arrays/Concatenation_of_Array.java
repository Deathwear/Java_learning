package Leetcode_Problems.Arrays;

// solution from here:

/*
    Given an array "nums" of length n.
    create an array ans of length 2n.
    ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n.
Explanation:
    here we need to print array same till length of previous array then after that we can print i-array.length
    let old array have length of 3, then till 2nd index new array will print same element and then after
    3rd index = 3rd - length (i.e. 3) = 0;
    therefore 3rd index will be same to 0th index then it will follow the same process again till arr.length*2;

    */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length*2; i++) {
            if (i < nums.length) { //index value will always be one less than array length i.e. no need of using equal sign.
                ans[i] = nums[i];
            } else{
                ans[i] = nums[i- nums.length];
            }
        return ans;
        }

    }
}