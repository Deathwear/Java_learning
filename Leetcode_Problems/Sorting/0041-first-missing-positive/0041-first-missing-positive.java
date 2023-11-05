// Asked in Amazon Interview Question.
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct= nums[i] - 1;  // this is the correct index value w.r.t elements in the array
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){  // here we have to ignore the negative nos. and also numbers to be cyclic sorted should be less than equal to total no of elements and if the nos are not at there correct position.
                swap(nums, correct, i);
            }else{
                i++;
            }
        }

        // Now the array is cyclic sorted we need for the first:
        for(int index = 0; index < nums.length; index++){
            if(index + 1 != nums[index]){
                return index + 1;
            }
        }
        return nums.length+1;  // should return the smallest element that is not present in the array and the array is sorted with all elements needed then we need to return one number greater bcz our array is starting from 1. not 0(zero).

    }

    public void swap(int[] arr, int first, int second ){  // this method will swap the elements 
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}