package Recursion.String;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqArray("", "abc"));
    }

    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // if a return type is array.
    static ArrayList<String> subseqArray(String p, String up){
        if (up.isEmpty()){ // Base condition.
            // create a new arraylist and add all processed values in it.
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqArray(p + ch, up.substring(1));
        ArrayList<String> right = subseqArray(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}