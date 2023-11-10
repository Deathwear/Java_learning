package String;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  // the operator converting this into its integer value (I think ASCII value)
        System.out.println("a" + "b"); // now this is concatenating the a&b stings (NOTE: double-quote for representing strings)
        System.out.println('a' + 3);  // this will print the ascii value of 'd' i.e., 100 (here: a moves three letter forwards and becomes d then it prints the ascii value of d)
        System.out.println('a');  // but this will print only a char
        System.out.println((char) ('a' + 3));  // this will just prints the character value i.e., 'd'.
        System.out.println("a" + 1); // NOTE: when an integer is concatenated to string, it is converted to its wrapper class integer  (integer will be converted to Integer that will call .toString())

        //More complex datatype: (for example)
        System.out.println("Aamir" + new ArrayList<>());  // recall what is the .toString of ArrayList is doing internally (it is empty so returning [] as an empty array list.)
        System.out.println("Aamir" + new Integer(56));  // check its .toString method called internally (Integer part is converted into String)
//        System.out.println(new ArrayList<>() + new Integer(56)); // check what happens to this (bad operand types for binary operator '+'first type:  java.util.ArrayList<java.lang.Object> second type: java.lang.Integer) // that will give error
        // + in java can only be used with premitives and with all complex object as well but atleast one of the object should have type string
        String ans = new ArrayList<>() + new Integer(56); // we have converted this output into string output so that we can print this output.
        System.out.println(ans);   // This will work bcz very fine we changed this into string.
    }
}


/*               -----------------<Important>--------------------
//        System.out.println(new ArrayList<>() + new Integer(56)); // check what happens to this (bad operand types for binary operator '+'first type:  java.util.ArrayList<java.lang.Object> second type: java.lang.Integer) // that will give error
        // + in java can only be used with primitives and with all complex object as well but at-least one of the object should have type string
        in this condition both expressions are not string or primitive datatype.

       => In java operator, overloading is not supported, but in c++/python operator, overloading is supported (but that results in poor code)
       => + operator intentionally supported in java to support string concatenation.(works as exception for string)



 */