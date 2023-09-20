package Linear_Search;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) {
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }
    static int digits2(int num) {
        return (int)(Math.log10(num)) + 1;
    }

}