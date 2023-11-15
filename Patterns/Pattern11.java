package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for (int row = 0; row <n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < (n-row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
