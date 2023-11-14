package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("The pattern 4 is printed like this: ");
        pattern1(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print(col);
            }
            //when one row is printed, we are needed to add a newline.
            System.out.println();
        }
    }
}
