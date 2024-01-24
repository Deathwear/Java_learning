// Find the possible combination of a dice to get the target.
// Using recursion

package Recursion.Practice;

public class DiceProblem {
    public static void main(String[] args) {
        dice("", 4);
    }

    static void dice(String p, int target){
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {  // i should not be greater than the target or the highest value of the dice
            dice(p+i, target-i);

        }
    }
}
