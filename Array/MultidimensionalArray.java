package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        /* look like matrices.
            1 2 3
            4 5 6
            7 8 9
         */
        // the no. of rows are mandatory but no. of columns are optional.
//      Syntax:
//          int[][] arr = new int[3][3]
//        imagine it as array of arrays;
                int[][] arr2D = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };   //can be written directly like this
                // size of the individual rows can be different.

    // internal working:
/* in c++ it is continuous memory allocation
but in java this is like:

 */
// for eg.
        // int[][] arr = new int[3][];



        // int[][] arr2D = {
        //      {1, 2, 3}, // 0th index
        //      {4, 5},   // 1st index
        //      {6, 7, 8, 9} // 2nd index -> for eg: arr2D[2] = {6, 7 8, 9}
        // };
        

        // input
        // input for all arrays inside of bigger array
 // this will print every data in an array and loop will terminate after completing its size (or length)
        

        // arr.length = gives no. of rows

                // take input for each column in every row.
                //Input for row:

                int[][] arr = new int[3][3];
                //System.out.println(arr.length); // print no. of rows
                // taking input:
                for (int row = 0; row < arr.length; row++) {
                        // for each column in every row
                        for (int col = 0; col < arr[row].length; col  ++) {
                                arr[row][col] = in.nextInt();
                        }
                }

                //output:
                // for (int row = 0; row < arr.length; row++) {
                //         // for each column in every row
                //         for (int col = 0; col < arr[row].length; col  ++) {
                //                 System.out.print(arr[row][col]+ " ");
                //         }
                //         System.out.println();
                // }
                //output
                // for (int row = 0; row < arr.length; row++) {
                //         System.out.println(Arrays.toString(arr[row]));
                // }
                // enhanced for loop for array
                for (int[] a : arr) {
                        System.out.println(Arrays.toString(a));
                }
                // to print string with enhanced for loop.
                // for (String element : arr) {
                //         System.out.println(element);
                // }   

        }  
}
