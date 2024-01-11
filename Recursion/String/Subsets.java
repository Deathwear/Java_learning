package Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subsets(arr);
        for (List<Integer> list : ans){  // this will print all the smaller List which is a part of bigger ans list.
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsets( int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for (int num : arr){
            int n = outer.size();  // n is the size of the outer array.
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));  // now the internal part is the copy of the outer part array
                // and now we just needed to add that element into it
                internal.add(num);  // now we are adding number to that internal array
                // which is the copy of the outer array
                // which is the part of the whole bigger array both outer and internal.
                outer.add(internal);   // now we have added that internal part in the outer part array
                // which becomes whole array
                // this is in a loop bcz

            }
        }

        return outer;
    }

}
