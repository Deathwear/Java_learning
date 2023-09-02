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
    }
}
// internal working:
/* in c++ it is continuous memory allocation
but in java this is like:
(** continued later)
 */