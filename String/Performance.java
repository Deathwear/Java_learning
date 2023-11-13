package String;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i);
            System.out.print(ch + " ");
            series = series + ch;  // series += ch

            // in the series it is copying the earlier series and appending a value into it and then printing it (every time it is creating a new string bcz strings are immutable) so much of memory/space wastage.
            // time complexity of O(n^2)
        }

        System.out.println(series);   // series will be printed only once when the for loop is terminated.
    }
}

// Timestamp : 1:14:00
// it would be great if there is a datatype which allow modification in itself. (no new object is needed to create) - StringBuilder