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

    }
}
