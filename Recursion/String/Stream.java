package Recursion.String;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip_Method2("baccdah"));
        System.out.println(skip_apple("bacapplecdah"));
        System.out.println(skipAppNotApple("bacapplcdah"));
    }

    // in this method ans is used in the arguments.
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

    // skips a string
    static String skip_apple(String up ){ // p = processed, up = unprocessed.
        // base condition.
        if (up.isEmpty()){
            return "";
        }


        if (up.startsWith("apple")){  // if the char at 0th index is a then we don't need to add it in our processed string.
            return skip_apple(up.substring(5));  // because apple has 5 characters from index 0 to 4 so begin substring with 5th index
        }else { // else add that char into the processed string.
            return up.charAt(0) + skip_apple(up.substring(1));
        }
    }



    // Skip a string if it is not required string.
    // it will remove app only if there is not apple in the string.
    static String skipAppNotApple(String up ){ // p = processed, up = unprocessed.
        // base condition.
        if (up.isEmpty()){
            return "";
        }


        if (up.startsWith("app") && !up.startsWith("apple")){  // if the char at 0th index is a then we don't need to add it in our processed string.
            return skipAppNotApple(up.substring(3));  // because apple has 5 characters from index 0 to 4 so begin substring with 5th index
        }else { // else add that char into the processed string.
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }


}
