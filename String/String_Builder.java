package String;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.deleteCharAt(0);  // try dots of builder and check on your own
        // methods and anything that string builder provides.

    }
}
