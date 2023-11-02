package Sorting;

import java.util.Arrays;

public class CyclicSorting {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSorting(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;  // it is stating that correct index of the element is its (value - 1) (When Range starts from 1 to n)
            if (arr[i] != arr[correct]) { // if the value of element is not according to value of current index
                swap(arr, i, correct); // then swap those elements.
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
