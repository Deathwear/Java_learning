package Recursion_Easy;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println("Our Target is 4 in the arr of [2, 3, 1, 4, 4, 5]");
        System.out.println("Is our target present in the array => " + searchIndex(arr, 4, 0));
        System.out.println("The index value of our target is: " + search(arr, 4, 0));
        System.out.println("The index value of our target is: "+searchFromLast(arr, 4, arr.length-1));

        // This is about creating ArrayList outside the function and calling it inside the function.
        searchAllIndex(arr, 4, 0);
        System.out.println("Index value of all occurrences are: " + list  + " ArrayList is created outside here.");


        // this is about creating arraylist inside the body of the function
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = searchAllIndexlist(arr, 4, 0, list); // new ArrayList is initialized here
        System.out.println(ans + " ArrayList is created inside the body of the function");

        System.out.println(list);



        // this is when Arraylist is not takes in the array arguments and takes inside the body
        System.out.println("ArrayList is not taken in the arguments" + searchAllIndexlist2(arr, 4, 0));
    }

    static int search(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return search(arr, target, index + 1);
        }
    }

    static boolean searchIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
            return arr[index] == target || searchIndex(arr, target, index + 1);
    }

    static int searchFromLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return searchFromLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        searchAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> searchAllIndexlist(int[] arr, int target, int index,  ArrayList<Integer> list){
        if (index == arr.length){  // the index value reaches its end then the whole list value is returned to its previous own searchAllIndexlist function
            return list ;
        }
        if (arr[index] == target){
            list.add(index);   // it will add the values to the ArrayList but doen't return it
        }
        return searchAllIndexlist(arr, target, index + 1, list);  // this will return its whole value to its previous own function call till all the memory in the stack.
    }


    // this is very complex please understand it very carefully.
    // Don't use this approach but should understand the concept
    static ArrayList<Integer> searchAllIndexlist2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list ;
        }

        // this will contain ans for that function call only
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = searchAllIndexlist2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);  // this will add all the ArrayList named "ansFromBelowCalls"
        // into the arrayList named as a list which is initialized above inside the same body of the function.

        return list;  // after adding one list to another list, we return the list to above-called function.
    }
}
