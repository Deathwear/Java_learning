package String;
// A palindrome is a word that reads the same backward as forward
public class CheckingPalindromeString {
    public static void main(String[] args) {
        String str = "";   // change the value of string and check if it is a palindrome or not.
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
