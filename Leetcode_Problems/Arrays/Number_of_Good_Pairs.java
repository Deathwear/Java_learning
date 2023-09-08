package Leetcode_Problems.Arrays;

/*
leetcode problem:
1512. Number of Good Pairs

problem statement:
Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

/*
Solution:
we need to return the no. of good pair

we need to check  for these condition,  if they match we count the value and return
first for loop for iterating ith index and inside i we need to iterate for jth index i.e. i+1 at-least and then moving forward till nums.length
inside the 2nd  for loop of j: if (nums[i] == nums[j]){we need to increase the count of GoodPair by 1}

so that they check for every value of ith position and i>j position of j:



 */

/*
Explanation:
we need to iterate for two elements i&j in the given array

for every element i we need to check for j for two condition:
index value of j should be greater than i (if index of i =0 then index of j = at-least i+1 then moving forward in the loop)
we need to go for loop that is for every i we check for j i.e. for i+1 value after checking come back to the loop of i with i++

so that, we need to use double for loop: 1st for iterating over the ith index and 2nd for iterating over the j which would i+1 index then go to the loop.
and then check for good pair by if(nums[i] == nums[j]){GoodPair++;}



 */
public class Number_of_Good_Pairs {
}




class Solution {
    public int numIdenticalPairs(int[] nums) {
        //initializing Count for GoodPair
        int GoodPair = 0;
        //loop for ith index
        for (int i = 0; i < nums.length; i++) {
            // loop for jth index
            for (int j = i+1; j < nums.length; j++) { //j = i+1; so that i<j; always
                // checking for good Pair
                if (nums[i] == nums[j]) {
                    GoodPair++;
                }
            }
        }
        return GoodPair;
    }
}
// Runtime beats 85%
// Memory   beats 80%