package Leetcode_Problems.Arrays;

/* leetcode: 1672. Richest Customer Wealth

Problem statement:
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money customer has in the bank.
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.

Solution:
we have given account[i][j] array:
[i] = amount of money in different bank Accounts.
[j] = another row for different person.
richest customer has highest value of sum of element in the array.(Highest value of sum of elements in a row)
it is 2d array: we have to store the sum of rows in an array and output the highest value of rows in the array

arr.length = no. of rows
arr[rows].length = no. of elements in a row




 */


/*
Explanation:
we have given 2d array. and needed to compare the sum of the rows of the array.
to get into the elements parts we need to intialize loops for the double times ->
one for getting rows and another for getting into elements of the row

in the first loop we get into the row of the 2d array
in the second loop we get into elements of the array and started doing sum of the elements
after summation, we are needed to compare this sum everytime with the rows sum ,
after intialising sum we compare and store the highest value and then started loop and for the elements of the second row
after summing elements of the second row it is compared with previous sum and the highest sum is stored .
going through loops many times and storing highest value.
we return the sum at the end of all rows (2d array);
 hence the returned value is printed.

 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int rows = 0; rows < accounts.length; rows++) {
            int sum = 0; //initialising sum for checking values.
            for (int columns = 0; columns < accounts[rows].length; columns++) {
                //writing code for summation of elements of rows.
                sum = sum + accounts[rows][columns]; //it is adding the elements of the rows.
            }
            if (sum > ans) {   //here we are checking sum value of every row when row summation is completed but doesn't switches the row.
                ans = sum;
            }
        }
        return ans;
    }
}

// Beats 100% user in runtime
// but, beats only 33% in memory
// manage memory later.