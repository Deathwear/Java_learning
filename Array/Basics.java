package Array;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax:
        // datatype[] variable_name = new datatype[size];
        // or, datatype[] var_name = {20, 35, 257, 45};

        //it is dynamic memory allocation (objects are created at runtime)
        // datatype and reference_variable are created at compile time and are stored in stack memory.
        // array objects are stored in heap memory
        // In JLS (java language specification) , they have mentioned that heap objects are not continuous.

        // Example:
        int[] arr = new int[5];
        arr[0] = 45;
        arr[1] = 23;
        arr[2] = 78;
        arr[3] = 549;
        arr[4] = 91;

        System.out.println(arr[3]); //array data of 3rd index will be printed
        // each particular element of an array will be an object.
        // this type of writing can be very repetitive so that we can use for loop

        //like:
        // input using for loop
        System.out.print("Enter 5 integers to be stored in an array: ");
        for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt(); // this will take input for every index value inside an array
        }
//      for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]+ " "); // this will print every data in an array and loop will terminate after completing its size (or length)
//      }

        //enhanced array
        for (int  num: arr) { // for every element in array, print the array
            System.out.print(num + " "); // here num represents element of the array
         }
//        System.out.println(arr[5]); //this will give index out of bound error
        // use of Scanner for taking input data of an array.
        //"arr.length" represents the length variable (length of an array i.e. depends on the size of an array) and for loop will take input accordingly.






    }
}
