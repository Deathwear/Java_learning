// No of digits in any representation of base b

// formula for that: int(log n with base b) + 1;
package Maths_for_DSA;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567;
        int b = 10;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;   // this is the formula for finding no of digits for any representation

        System.out.println(ans);
    }
}


// another way of doing this is to right shift with keeping a counter.