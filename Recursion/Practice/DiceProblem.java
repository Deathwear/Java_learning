// Find the possible combination of a dice to get the target.
// Using recursion

package Recursion.Practice;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println(diceList("", 4));
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

    // Return type as an ArrayList
    static ArrayList<String> diceList(String p, int target){
        if (target == 0) {
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i<= target; i++) {
            list.addAll(diceList(p+i, target-i));  // processed me jitna judega utna target me minus bhi hoga
        }
        return list;
    }
}
