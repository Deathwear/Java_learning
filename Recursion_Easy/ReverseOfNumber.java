package Recursion_Easy;

public class ReverseOfNumber {
    public static void main(String[] args) {
        reverse1(1884026);
        System.out.println();
        reverse2(1884026);
        System.out.println(sum);
    }

    static int sum = 0;
    static void reverse2(int n){
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
}
