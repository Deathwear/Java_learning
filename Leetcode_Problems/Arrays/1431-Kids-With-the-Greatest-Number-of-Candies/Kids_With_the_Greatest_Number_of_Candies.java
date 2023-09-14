package Leetcode_Problems.Arrays;

import java.util.ArrayList;
import java.util.List;

/*
leetcode:
1431. Kids With the Greatest Number of Candies

Problem statement:
There are n kids with candies.
You are given an integer array candies,
where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies,
denoting the number of extra candies that you have.

Return a boolean array result of length n,
where result[i] is true if,
after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids,
or false otherwise.
*/


/*
Solution:
boolean array result true() if: candie[i] + extraCandies > Highest value;
                                  return true;
                            else: return false;

we need to store this true false in array named as result as declared in question:
so we will add this true & false as: result.add(true) if: candie[i] + extraCandies > Highest value;
else: result.add(false); will be added in the array

and the array result will be returned:
return result;
*/


/*
Explanation:
we need to first find the highest element in the array
(can be done by using for loop for iterating and using if candies[i]>maxCandies {maxCandies = candies[i]}),
then after storing highest value of candie;

we will check for boolean value using if-else:
if: candie[i] + extraCandies > Highest value;
    result.add(true);
else: result.add(false);
 */
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // first we need to find maxCandies using for loop as:
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>(); //creating an array to store result
        //here we are using for loop for iterating each element and then using if loop to find maxCandies:
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i]; //this will store the maxCandies value
            }
        }
        // Now, checking if extraCandies + candies[i] >= maxCandies
        // using for loop for iterating over an array and then using if-else for checking for >= maxCandies.
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= maxCandies) {
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}

// Runtime 1ms, Beats 87% of users with java
// Memory 41MB, Beats 60% of users with java