package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("The pattern 3 is printed like this: ");
        pattern3(4);
    }

    static void pattern3(int n){
        for (int row = n; row >= 0; row--) {
            // for every row, run the col
            for (int col = row; col >= 0 ; col--) {   // same as ques2 but only need to keep column size decreasing every time
                System.out.print("*");
            }
            //when one row is printed, we are needed to add a newline.
            System.out.println();
        }
    }
}
