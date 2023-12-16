package Maths_for_DSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        method1(20);
        method2(20);
        method3(20);
    }

    // O(n)
    static void method1(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");  // here we are checking for 2 and 10 both, but we are only needed to check for 2 and prints 2and 10 both as a factor of 20, so we can reduce the time complexity here.  (so only check till the square root of n)
            }
        }
        System.out.println();
    }


    // o(sqrt(n))

    static void method2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n/i + " "); // Not giving a result in sorted order.
                }
            }
        }
        System.out.println();
    }

    // both time and space will be O(sqrt(n))
    static void method3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);  // all the second half will be stored in descending order
                }
            }
        }
        for (int i = list.size() -1; i >= 0; i--) {  // we need to print that descending order array into ascending order
            System.out.print(list.get(i) + " ");
        }
    }
}
