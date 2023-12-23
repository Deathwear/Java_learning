package Recursion_Easy;

import java.util.ArrayList;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println("Our Target is 4 in the arr of [2, 3, 1, 4, 4, 5]");
        System.out.println("Is our target present in the array => " + searchIndex(arr, 4, 0));
        System.out.println("The index value of our target is: " + search(arr, 4, 0));
        System.out.println("The index value of our target is: "+searchFromLast(arr, 4, arr.length-1));
        searchAllIndex(arr, 4, 0);
        System.out.println("Index value of all occurrences are: " + list);
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
}
