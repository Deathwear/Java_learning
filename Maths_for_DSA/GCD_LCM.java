package Maths_for_DSA;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println("HCF of 4&14 is: " + gcd(4, 14));
        System.out.println("LCM of 4&14 is: " + lcm(4, 14));
    }

    static int gcd(int a, int b){
        if (a == 0){
            return b;   // when a%b remainder becomes zero, the recursion breaks, and we will get b as ans.
        }
        return gcd(b%a, a);  // b%a will give a remainder then we will do the gcd of remainder and a again and again until we get 0 as a remainder or a.
    }

    static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}
