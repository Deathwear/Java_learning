//Asked in Amazon

package Maths_for_DSA;

public class MagicNumber {
    public static void main(String[] args) {
        int n =6;
        int ans = 0;
        int base = 5;

        while (n>0){
            int last = n & 1;  // this will give the last digit in binary representation
            n = n >> 1;  // right shifting the binary nubmer to get the next last digit
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}

// Debug this code to understand its working.