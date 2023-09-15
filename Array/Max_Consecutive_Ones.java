package Array;


/*

leetcode problem statement:

Given a binary array nums, return the maximum number of consecutive 1's in the array.



Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2


Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.

 */
public class Max_Consecutive_Ones {
    public static int main(String[] args) {
        int currentCount = 0;
        int maxCount = 0;
        // nums array is already given
        int[] nums = new int[0];
        for (int num : nums) {
            if (num == 1) {
                currentCount++;  // Increment the count for consecutive 1's
            } else {
                maxCount = Math.max(maxCount, currentCount);  // Update maxCount if needed
                currentCount = 0;  // Reset currentCount when a 0 is encountered
            }
        }

        // After the loop ends, we need to check one more time to handle the case where
        // the consecutive 1's end at the last element of the array.
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;

    }
}
