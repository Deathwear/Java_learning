package Recursion.String;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip_Method2("baccdah"));
    }

    // in this method ans is used in the arguements.
    static void skip(String p, String up ){ // p = processed, up = unprocessed.
        // base condition.
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a'){  // if the char at 0th index is a then we don't need to add it in our processed string.
            skip(p, up.substring(1));
        }else { // else add that char into the processed string.
            skip(p + ch, up.substring(1));
        }
    }


    // ans is used in the body of the recursive call.
    static String skip_Method2(String up ){ // p = processed, up = unprocessed.
        // base condition.
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a'){  // if the char at 0th index is a then we don't need to add it in our processed string.
            return skip_Method2(up.substring(1));
        }else { // else add that char into the processed string.
            return ch + skip_Method2(up.substring(1));
        }
    }
}
