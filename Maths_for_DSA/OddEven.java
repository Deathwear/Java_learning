// Bitwise Manipulation

package Maths_for_DSA;

public class OddEven {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;   // Using and operator
    }
}
