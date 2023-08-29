package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter Employee ID: ");
        int empID = in.nextInt();
        

        switch (empID) {
            case 1:
                System.out.println("Aamir Reza");
                break;
            case 2:
                System.out.println("Shahrukh khan");
                break;
            case 3:
                System.out.print("Please enter department name: ");
                String department = in.next();
                switch (department) {
                    case "IT" :
                        System.out.println("Rahul from IT department");
                        break;
                    case "Management":
                        System.out.println("Rahul from Management department");
                        break;
                    default:
                        System.out.println("Rahul with no department");
                        break;
                }
        
            default:
                System.out.println("please enter correct empID and department");
                break;
        }


    }
}
