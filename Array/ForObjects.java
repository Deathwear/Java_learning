package Array;

import java.util.Arrays;
import java.util.Scanner;


// creating array for objects.
public class ForObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify:
        str[1] = "Aamir"; // first object will be changed to Aamir.



    }

}
// storing reference variable to the objects, these objects can be anywhere in the heap