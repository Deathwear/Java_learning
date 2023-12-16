class Solution0832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row: image){
            // revert the elements of the 2d array.
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i]  ^ 1;  // XOR with 1 to get the opposite value of the elements.
                row[i] = row[image[0].length-i -1] ^ 1;   //Performing XOR for flipping the value.(needed to XOR with the other half of the array)
                row[image[0].length-i -1] = temp;
            }
        }
        return image;
    }
}