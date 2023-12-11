// Bitwise Manipulation
package Maths_for_DSA;

public class FindUniqueNo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr){
        int unique = 0;

        for (int n : arr){
            unique ^= n;  // Using XOR operator (i.e., a^a = 0)
        }

        return unique;
    }
}
