package Recursion_Easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = digits(1432);
        System.out.println(ans);
    }

    static int digits(int n){
        if (n == 0){
            return 1;
        }
        return (n%10) * digits(n/10);
    }
}
