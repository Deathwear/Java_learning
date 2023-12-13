package Maths_for_DSA;

public class FindingPower {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;

        int ans = 1;

        while(power>0){
            if ((power & 1) == 1) {
                ans *= base;
            }

            base *= base;
            power = power>>1;
        }

        System.out.println(ans);
    }
}

// it has a time complexity of O(log b)

// if we try to multiply it 6 times then it would have time complexity of O(N)