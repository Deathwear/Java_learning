package Recursion_Easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
        String str = "12321";
        System.out.println(method2(str));
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

    // using indices value for string
    public static boolean method2(String str) {
        // base case
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        // check first and last characters
        if (str.charAt(0) != str.charAt(str.length()-1)) {
            return false;
        }
        // check the remaining string
        return method2(str.substring(1, str.length()-1));
    }
}
