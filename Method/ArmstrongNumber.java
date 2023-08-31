package Method;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // print all the three digits armstrong number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3-digit number to check if it is armstrong or not: ");
        int n = in.nextInt();

        System.out.println(isArmstrong(n));

    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
            
        }

        if (sum == original) {
            return true;
            
        }else{
            return false;
        }
    }
}
