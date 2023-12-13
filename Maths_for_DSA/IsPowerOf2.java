package Maths_for_DSA;

public class IsPowerOf2 {
    public static void main(String[] args) {
        int n = 16;
        boolean ans = (n & (n-1)) == 0;    // binary representation of 2's power number has only one 1 so so doing operation with all the other zero with 1 we get all 0
        System.out.println(ans);
    }
}
