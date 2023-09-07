package Leetcode_Problems.Arrays;

/*
Leetcode 1470. Shuffle the Array

Problem:
Given the array nums consisting of 2n
elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */

/*
Analyze:
we have given array of nums, no of elements as (2n):
let n = 3, then it will be[1, 2, 3, 1, 2, 3];
and we need to write: [1, 1, 2, 2, 3, 3]
to write this we can use:
for loop as:
ans[i*2] = num[i]
ans[i*2+1] = num[n+i]
 */

/*
Explanation:
ans[i*2] = will fill all the even place as nums[i] odd places elements will also shift to the even places till nth index
as nums.length = 2n
and
ans[i*2 + 1] = will fill all the odd place elements will the n+ith elements of the nums arrays.

and the new array formed will the in the desired sequence.



 */
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n]; //initialising array
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }
}

//runtime beats 100%
// space beats 70%