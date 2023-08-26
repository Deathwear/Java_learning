package Switch;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your favourite fruit name: ");
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruit");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "grapes":
                System.out.println("green small fruit");
                break;
            case "banana":
                System.out.println("laude jaisa fruit");
                break;
            case "guava":
                System.out.println("Big round green fruit");
                break;
            case "orange":
                System.out.println("round orange color fruit");
                break;
            default:
                System.out.println("I don't know anything about this fruit...!!!");
        }

    }
}
