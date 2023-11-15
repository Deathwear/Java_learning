package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n){
        for (int row = 0; row <n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
