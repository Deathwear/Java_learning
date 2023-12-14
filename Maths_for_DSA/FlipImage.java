// leetcode ques no 832 https://leetcode.com/problems/flipping-an-image/description/

package Maths_for_DSA;

public class FlipImage {
    public static void main(String[] args) {
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            // revert the elements of the 2d array.
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i]  ^ 1;  // XOR with 1 to get the opposite value of the elements.
                row[i] = row[image[0].length- i -1] ^ 1; // doing XOR for flipping the value.
                row[image[0].length- i -1] = temp;
            }
        }
        return image;
    }
}

/*
performing XOR 0,1 with 1 will flop their values as:
        for 0>> 0 ^ 1 = 1 (0 becomes 1)
        for 1>> 1 ^ 1 = 0 (1 becomes 0)
 */
