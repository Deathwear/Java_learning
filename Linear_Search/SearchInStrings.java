package Linear_Search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Aamir";
        char target = 'm';
        System.out.println(search(name,target));
    }

    static boolean  search(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
//return true if target element is present in the String name.
// otherwise prints false.
 