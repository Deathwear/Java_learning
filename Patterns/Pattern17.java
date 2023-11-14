package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        patter17(5);
    }
    static void patter17(int n){
        for (int row = 1; row <= 2*n; row++) {
            int c = row>n ? 2*n-row : row;

            // only spaces are remaining
            for (int spaces = 0; spaces < n-c ; spaces++) {
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
