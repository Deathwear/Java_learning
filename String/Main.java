package String;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 19};
        int num = 10;
        String name = "Aamir Reza";  // strings are immutable
//        System.out.println(name);

        String a = "Aamir";
        System.out.println(a);
        a = "Aamir";
        System.out.println(a);   // here pooling concept is used therefore, both a will points towards same object in the heap memory in the pool.
    }
}
// if we decide to change the value of 'a' then a will points towards another object and Aamir will go to garbage collection.

/*
There are mainly two concept of Strings:
   => Pooling
   => Immutability
 */