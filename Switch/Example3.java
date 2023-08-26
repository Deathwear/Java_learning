package Switch;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter day no: ");
        int day = in.nextInt();


//  enchanced  switch expresssion
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
            default -> {
            }
        }

    }
}

// Classic syntax for this :

//    switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            System.out.println("Weekdays");
//            break;
//            case 6:
//            case 7:
//            System.out.println("Weekend");
//            break;
//default:
//        break;
//        }