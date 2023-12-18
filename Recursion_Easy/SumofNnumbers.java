package Recursion_Easy;

public class SumofNnumbers {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }

    static int sum(int n){
        if (n == 0){
            return 0;
        }
        return n + sum(n-1);
    }
}

// quiet similar to factorial funtion, just need to add instead of multiply.
