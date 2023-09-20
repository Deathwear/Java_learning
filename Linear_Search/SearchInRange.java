package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.print("The index value of the target is: ");
        System.out.println(linearSearch(arr, target, 1, 4));
    }


    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }
        //run for a loop
        for (int index = start; index < end; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed 
        // hence the target not found 
        return -1;
    }
}

// here we have used the code as in linear search but in the for loop we used the start & end of the index value as given .
// just need to do that only nothing else.
