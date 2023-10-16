package Binary_Search;

public class PivotInRotatedSortedArray {
    public static void main(String[] args) {
        int[] rotatedArray = {3, 4, 5, 6, 7, 0, 1, 2};
        int pivot = findPivot(rotatedArray);
        System.out.println("The pivot element is: " + pivot);
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end- start)/2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid -1;
            }
            if (arr[mid] <= arr[start]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
