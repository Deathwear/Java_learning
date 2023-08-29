package Method;

import java.util.Scanner;

public class String_parameter {
// here i have created greet method to call everytime and not needed to repeat code for this
// main method is regularly used with this.
    static String greet(String name) {
        String greeting = "Hello " + name;
        return greeting;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of first employee: ");
        String emp1 = in.nextLine();
        System.out.print("Enter name of second employee: ");
        String emp2 = in.nextLine();
        String personalised = greet(emp1);
        System.out.println(personalised);
        String employee_name = greet(emp2);
        System.out.println(employee_name);
    }
}
