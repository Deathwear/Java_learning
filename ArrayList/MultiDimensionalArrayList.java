package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation
        System.out.println("Enter 3 rows and 3 columns element to add in ArrayList: ");
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(new Scanner(System.in).nextInt());
            }
        }

        System.out.println(list);

    }
}
