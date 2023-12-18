package Recursion_Easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = digits(1432);
        System.out.println(ans);
    }

    static int digits(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + digits(n/10);
    }
}
