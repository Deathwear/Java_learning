package Recursion_Easy;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 12, 34, 45, 67, 89};
        System.out.println(searchIndex(arr, 34, 0));
        System.out.println("The index value of our target is: " + search(arr, 34, 0));
        System.out.println("The index value of our target is: "+searchFromLast(arr, 34, arr.length-1));
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
}
