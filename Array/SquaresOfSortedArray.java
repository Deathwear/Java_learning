package Array;
import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] squaredArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            squaredArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }

    public static void main(String[] args) {
        SquaresOfSortedArray solution = new SquaresOfSortedArray();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);

        System.out.println("Sorted Squares: " + Arrays.toString(result));
    }
}

// first squaring the elements of nums and then sorting them.
