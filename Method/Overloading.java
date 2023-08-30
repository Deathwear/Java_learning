package Method;
// Method Overloading decides when to call which function
public class Overloading {
    public static void main(String[] args) {
        fun(25); // here int method is called
        fun("Aamir Reza"); // here String method is called
    }
    // Creating two method of same name but different parameter.
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
