package Patterns;

public class Pattern3_2ndMethod {
    public static void main(String[] args) {
        System.out.println("The pattern 2 is printed like this: ");
        pattern3(4);
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n+1-row ; col++) {
                System.out.print("*");
            }
            //when one row is printed, we are needed to add a newline.
            System.out.println();
        }
    }
}
