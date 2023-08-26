import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the operator or enter X to exit: ");
            char op = in.next().trim().charAt(0);

            //checking for operators and the performing actions
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //taking two numbers from user to perform operation
                System.out.print("enter two numbers: ");

                int num1 = in.nextInt();
                int num2 = in.nextInt();
                
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }else{
                        System.out.print("num2 can't be zero for division!!");
                    }
                    
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.print("enter the valid operand.");
            }System.out.println(ans);
                
        }
            
    }
}

