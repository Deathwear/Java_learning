package Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(3);
    }

    static void pattern31(int n){
        for (int row = 0; row <= 2*n; row++) {
            for (int col = 0; col <= 2*n; col++) {
                int atEveryIndex = n - Math.min(Math.min(row, col), Math.min(2*n-row, 2*n-col)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println("");
        }
    }

}
