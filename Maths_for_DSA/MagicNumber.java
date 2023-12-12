//Asked in Amazon

package Maths_for_DSA;

public class MagicNumber {
    public static void main(String[] args) {
        int n =6;  // Binary representation of 6 is 110
        int ans = 0;
        int base = 5;

        while (n>0){
            int last = n & 1;  // this will give the last digit in binary representation i.e., 0 for 1st loop
            n = n >> 1;  // right shifting the binary nubmer to get the next last digit (in first loop 110 will become 11 i.e., 3 in decimal representation)
            ans += last * base;
            base = base * 5;  // every time base will be multiplied by 5 as the condition of the magic number.
        }
        System.out.println(ans);
    }
}

// Debug this code to understand its working.