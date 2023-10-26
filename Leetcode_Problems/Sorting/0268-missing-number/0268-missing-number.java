class Solution0268 {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            if (nums[i]< nums.length && nums[i] != nums[nums[i]] ) { // if the value of element is not according to value of current index
                swap(nums, nums[i], i ); // then swap those elements.
            }else{ // if the element has not any correct by now therefore we are needed to skip that element and sort other elements all the elements  will be sorted except that element.
                i++;
            }
        }

        // search for first missing number
        for(int index = 0; index < nums.length; index++){
            if(index != nums[index]){
                return index;  // we are needed to return the index that is also element value (if we return element the result will not be the desired output// )
            }
        }
        return nums.length; // here it means that all the element are present at right index therefore the last element is missing that's why we are needed to return last element'
    }
    // Swapping method is used for swapping the elements to its correct postion 
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
// I have used the concept of cyclic sort here.
// leetcode solution 0268
// Asked in Amazon interview Question.
