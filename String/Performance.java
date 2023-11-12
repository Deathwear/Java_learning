package String;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
            series = series + ch;  // series += ch
        }

        System.out.println(series);
    }
}

// Timestamp : 1:14:00