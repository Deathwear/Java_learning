package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("The pattern 2 is printed like this: ");
        pattern1(5);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n ; col++) {   // same as ques2 but only need to keep column size constant every time
                System.out.print("*");
            }
            //when one row is printed, we are needed to add a newline.
            System.out.println();
        }
    }
}
