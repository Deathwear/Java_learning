package Recursion_Easy;

public class From1toN {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if (n == 0){
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }
}
/* if function call appears first then value remains in the stack and calls for another function before printing,
so that it will print in ascending order.
otherwise,
if we print the function first and then call the function n-1 later then it will be printed in the descending order
(because of the function not remain in stack memory)

 here it works as:
 F(5) -> F(4) -> F(3) -> F(2) -> F(1) -> print(1) -> print(2) -> print(3) -> print (4) -> print(5);
 function ends no more calls left.
 */
