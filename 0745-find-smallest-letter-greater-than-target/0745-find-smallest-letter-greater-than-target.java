class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid-1;
            } else {
                start = mid +1;
            }
        }  // we need to terminate the while loop always bcz we are not looking for target == mid index value.
        return letters[start % letters.length];
        /* or we can also return this as:
            if (start == letters.length){
                return letters[0];
            }  instead of letters[start % letters.length]
           it will cover the wraping of letters in the array
        */ 
    }
}

    // I am using binary search here 
    // time complexity of log(N)