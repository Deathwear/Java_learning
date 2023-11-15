package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalColsInRow = row > n ? 2 *n - row+1: row;  // If-Else notation.
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print(" ");
            }
            int totalStartsneeded = row > n ? row-n : n-row+1;  // If-Else notation.
            for (int col = 0; col < totalStartsneeded; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we are needed to add a newline.
            System.out.println();
        }
    }
}
