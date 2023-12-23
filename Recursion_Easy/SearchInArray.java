package Recursion_Easy;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 12, 34, 45, 67, 89};
        System.out.println("The index value of our target is: " + search(arr, 34, 0));
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
}
