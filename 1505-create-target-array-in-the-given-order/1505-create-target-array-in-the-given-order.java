class Solution {
    public int[] createTargetArray(int[] nums, int[] index) { //nums and index array would be of same size
        int[] target = new int[nums.length]; // initializing an array
        for(int i=0; i<index.length; i++){               // 1st or loop for ith index 
            for(int j=nums.length-1; j>index[i]; j--){  //here index[i] = element in the index array which is the index of the target array
                target[j] = target[j-1];   //target index would be the previous one (Repeating previous steps) || To remove the overlapping index
            }   // when j = index[i] ; loops terminates thus overlapping problem is solved
            target[index[i]] = nums[i];
        }
        return target;
    }
}





/*
Given two arrays: nums && index
create: target arrays
index[i] = nums[i];  (repeat previous step)

we need to put nums value in the target array at given index of index array's value;
here: target index would be the value of index array, and element value would be value of value of nums array as:
                target[index[i]] = nums[i];  || target.add(index[i], nums[i]);
we can write it like this

we can use it in the loop as said for previous value we will be going in decreament value
nums and index array would be of same size







*/