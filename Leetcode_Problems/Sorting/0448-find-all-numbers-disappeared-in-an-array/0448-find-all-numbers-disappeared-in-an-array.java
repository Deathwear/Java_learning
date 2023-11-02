import java.util.ArrayList;
import java.util.List;

class Solution0448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if( nums[i]<= nums.length && nums[i] != nums[correct]){ 
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        // now the array is cyclic sorted (it also works for duplicate values by ignoring them)
        // now checking for all missign nums in the cyclic sorted array
        ArrayList<Integer> ans = new ArrayList<>();// creatign array list with not fixed length to store values of missing numbers (bcz we don't know the values of missing numbers')
        for(int index =0; index< nums.length; index++){
            if(nums[index] != index +1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    public void swap(int[]nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}