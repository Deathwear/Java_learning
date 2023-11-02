class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i < arr.length){
            int correct = arr[i] -1;  // Bcz range is starting from 1 and index starts from 0;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        // now the array is cyclic sorted , therefore now we have check for duplicate elements and store them in the Arralylist of undefined length.
        ArrayList<Integer> ans = new ArrayList<>(); // initializing an arrayList of undefined length.
        for(int index=0; index<arr.length; index++){ // searching in the whole array.
            if(arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }
        return ans;

    }

    // Method for swapping elements of an array.
    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}