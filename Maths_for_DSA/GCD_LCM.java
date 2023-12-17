package Maths_for_DSA;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(224, 105));
    }

    static int gcd(int a, int b){
        if (a == 0){
            return b;   // when a%b remainder becomes zero, the recursion breaks, and we will get b as ans.
        }
        return gcd(b%a, a);  // b%a will give a remainder then we will do the gcd of remainder and a again and again until we get 0 as a remainder or a.
    }
}
