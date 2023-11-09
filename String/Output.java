package String;

// Ways of printing of string

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
//        Integer num = new Integer(56);
//        System.out.println(num.toString());
//        System.out.println(num);
//        System.out.println("Kunal");
//        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));
////
//        String name = null;
//        System.out.println(name);
    }
}

// when we print any integer or array or string, it gets converted into strings internally (they are calling .toString method internally) that's what we see in the console is the string representation of the array or whatever we pass
// It uses the method-overloading technique to decide which method to call when we pass integer, array or anything (by using method overloading)

// check the internal working of each print method (using ctrl+"left mouse key") to check which method they are calling internally to understand the working of each called function/method.
