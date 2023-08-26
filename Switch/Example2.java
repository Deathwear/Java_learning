package Switch;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter your day no: ");
        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("this is monday");
            case 2 -> System.out.println("this is Tuesday");
            case 3 -> System.out.println("this is Wednesday");
            case 4 -> System.out.println("This is Thursday");
            case 5 -> System.out.println("this is Friday");
            case 6 -> System.out.println("this is Saturday");
            case 7 -> System.out.println("this is Sunday");
            default -> System.out.println("Please enter a valid day no.");
        }
        
    }
}
