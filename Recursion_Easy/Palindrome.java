package Recursion_Easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
    }

    static boolean palindrome(int n){
        return n == reverse3(n);  //by comparing both original and its reverse using reverse function previously explained
    }

    static int reverse3(int n){
        // sometimes you need some addition variables in the arguments
        // in that case, make another function.
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
}
