class Solution1365_1 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int [nums.length]; //length could never be greater than nums length
        //initializing first loop for i
        for(int i=0; i<nums.length; i++){
            int count = 0; // initialising count
            //initializing second loop to compare with the first element
            for(int j = 0; j<nums.length; j++){
                //if statement to check wether it is greater or not, and then adding to count
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i] = count;//storing every count value in the array, when i compared with every j
        }
        return ans; //returning an array after both loop ends
    }
}




/*
Approach: 
we need to take two input in the for loop:
[i] for current number
[j] for comparing between them 
and initialize an array and list.add the values for every [i] element compare
basically,
we are comparing every i in j loop for other numbers if jth value is greater we will do count++
add that count value in the initialised array.
and then return that array.
*/

//Runtime Beats 77%
//Memory Beats 42%