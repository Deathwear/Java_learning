package Patterns;

import javax.crypto.spec.PSource;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row >n ? 2 *n - row: row;  //if columns are greater than n then total columns will be 2n-row else they will be like only equal to row like in ques 2.
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*");
            }
            //when one row is printed, we are needed to add a newline.
            System.out.println();
        }
    }
}
