package Method;

import java.util.Arrays;
// here we don't know the no. exvactly how many arguements are we going to take that's why we use Varargs
public class Varargs {
    public static void main(String[] args) {
        fun(2, 3, 45, 46, 23, 78, 85);
        multiple(1, 5, "Aamir", "Reza", "args");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a, int b, String ...v){
        System.out.println();

    }
}
