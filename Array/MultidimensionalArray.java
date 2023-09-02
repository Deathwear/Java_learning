package Array;

public class MultidimensionalArray {
    public static void main(String[] args) {
        /* look like matrices.
            1 2 3
            4 5 6
            7 8 9
         */
        // the no. of rows are mandatory but no. of columns are optional.
//      Syntax:
//          int[][] arr = new int[3][3]
//        imagine it as array of arrays;
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };   //can be written directly like this
    }  // size of the individual rows can be different.

    // internal working:
/* in c++ it is continuous memory allocation
but in java this is like:

 */
// for eg.
        int[][] arr = new int[3][];

        int[][] arr2D = {
                {1, 2, 3}, // 0th index
                {4, 5},   // 1st index
                {6, 7, 8, 9} // 2nd index -> for eg: arr2D[2] = {6, 7 8, 9}
        };

        // input
        // input for all arrays inside of bigger array


}
