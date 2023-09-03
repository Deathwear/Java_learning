package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(55);
        list.add(45);
        list.add(56);
        list.add(98);
        list.add(565);
        list.add(454);
        list.add(124);
        list.add(67);

        System.out.print("Our Default ArrayList: ");
        System.out.println(list); //can be simply printed by calling reference variable and .toString() will be called internally.
        // for loop can also be used as in arrays
        // also we can do many operation like removing values, changing values by set, and many more.
        // can directly use ref.variable to print && it is using .toString internally by itself
        System.out.println("1st index value will be changed to 777");
        list.set(1,777); // will change the
        System.out.println(list.contains(565)); //will check if this is present in the ArrayList.
        list.remove(2); // 2nd index value will be removed from the list.

        // input
        System.out.print("Enter 5 integers which is to added in the ArrayList: ");
        for (int i = 0; i <5; i++) {
            list.add(in.nextInt());
            System.out.println(list);
        }
        
        //get item at any index
        System.out.print("All the elements of the list till 4th index: ");
        for (int i = 0; i <5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here.
        }
        System.out.print("Final ArrayList: ");
        System.out.print(list);
    }
}
/*
NOTES:
-> Sizes of ArrayList is actually fixed internally
-> We can say that ArrayList are fills by some amount
            =>  it will create a new Arraylist of lets say double the size
            old elements are copied in the new list and the old elements are deleted.
-> continue from internal working of arraylist.




 */