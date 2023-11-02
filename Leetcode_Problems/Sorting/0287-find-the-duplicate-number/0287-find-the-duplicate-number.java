class Solution0287 {
    public int findDuplicate(int[] arr) {
        int i =0;
        // performing cyclic sort
        while(i<arr.length){
            if(arr[i] != i+1){
                int correct = arr[i] -1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{  //this will only be executed when when arr we have isnot at their correct index but the element is same as the element which is at its correct index (means it is duplicate elememt)
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// asked in amazon and microsoft also.