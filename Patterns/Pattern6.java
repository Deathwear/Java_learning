package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n-row; col++) {  // I have started col from 1 have exact spaces as required.
                System.out.print(" ");
            }for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
