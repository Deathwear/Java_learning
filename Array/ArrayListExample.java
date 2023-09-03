package Array;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(45);
        list.add(56);
        list.add(98);
        list.add(565);
        list.add(454);
        list.add(124);

        System.out.println(list); //can be simply printed be calling reference variable and .toString() will be called internally.
        // for loop can also be used as in arrays
        // also we can do many operation like removing values, changing values by set, and many more.
        
    }
}
