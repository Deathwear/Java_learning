package Recursion_Easy;

public class ReverseOfNumber {
    public static void main(String[] args) {
        reverse1(1884026);
        System.out.println();
        reverse2(1884026);
        System.out.println(sum);
        System.out.println(reverse3(1234));
    }

    static int sum = 0;
    static void reverse2(int n){   // we are taking extra variable outside the function (cheating/not pure recursion)
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse2(n/10);
    }

    static void reverse1(int n){
        if (n == 0){
            return;
        }
        System.out.print(n%10);   // This is cheating all numbers are printed separately.
        reverse1(n/10);
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
