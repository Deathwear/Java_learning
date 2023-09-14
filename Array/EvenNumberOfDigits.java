package Array;
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int evenDigitCount = countNumbersWithEvenDigits(nums);
        System.out.println("Numbers with even digits: " + evenDigitCount);
    }

    public static int countNumbersWithEvenDigits(int[] nums) {
        int count = 0;  // Initialize a count to keep track of numbers with even digits

        for (int num : nums) {
            // Calculate the number of digits in num
            int numDigits = 0;
            while (num != 0) {
                num /= 10;
                numDigits++;
            }

            // Check if the number of digits is even
            if (numDigits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
