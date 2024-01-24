// this is a sample sollution of leetcode question no. 17

package Recursion.Practice;

import java.util.ArrayList;

public class LetterCombinationOfPhoneNo {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padList("", "12"));
        System.out.println(padCount("", "12"));
    }

    static void pad(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';  // this will convert the is unprocessed character into an integer type
        // now we will run the for loop for that character in its range and keep it in the processed value.
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            // now we inside the range of the alphabets to its index values
            // we need to convert this int index values to its character by adding 'a' to it
            char ch = (char)('a'+ i );  // now the index values will be converted to its respective integers.
            // now we will add this character into the processed list and remove the first character of unprocessed list  and perform the recursion
            pad(p + ch, up.substring(1));
        }
    }

    // here a return type is ArrayList.
    static ArrayList<String> padList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';  // this will convert the is unprocessed character into an integer type

        ArrayList<String> list = new ArrayList<>();

        // now we will run the for loop for that character in its range and keep it in the processed value.
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            // now we inside the range of the alphabets to its index values
            // we need to convert this int index values to its character by adding 'a' to it
            char ch = (char)('a'+ i );  // now the index values will be converted to its respective integers.
            // now we will add this character into the processed list and remove the first character of unprocessed list  and perform the recursion
            list.addAll(padList(p + ch, up.substring(1)));
        }
        return list;
    }

    static int padCount(String p, String up){
        if (up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0) - '0';
        int count =0;
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            char ch = (char)('a'+ i );
            count = count + padCount( p + ch, up.substring(1));
        }
        return count;
    }
}
/*
Here, we have taken a letter combination from 1 to the 9 which is not accurate to the phone number,
But in leetcode question no.17 the letter combination is accurate to the phone no so adjust your solution accordingly
 */