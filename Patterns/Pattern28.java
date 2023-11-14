package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        System.out.println("The pattern 2 is printed like this: ");
        pattern5(5);
    }

    static void pattern5(int n){
        for (int row = 1; row <= 2*n-1; row++) {
            int totalColsInRow = row >n ? 2 *n - row: row;
            int totalSpaces = n- totalColsInRow;
// just like ques5 but also need to print spaces also.
            for (int s = 0; s < totalSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we are needed to add a newline.
            System.out.println();
        }
    }
}
