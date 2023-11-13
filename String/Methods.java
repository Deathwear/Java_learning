package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Aamir Reza Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));  // it will be converted into charater stuff and then prints it into array representation.
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));  //prints its first occurance
        System.out.println("   Aamir   ".strip());  // extra spaces will be removed.
        System.out.println(Arrays.toString(name.split(" ")));  // will split this from the space given in the string
    }
}
