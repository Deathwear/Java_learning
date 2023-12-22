package Recursion_Easy;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);
    }
}
/*
There is a lot of difference between f-- and --f :
in f-- >> function is executed first and then the variable of function decreases.
Whether in --f  >> variable of function decreases first then the function is executed.

 */