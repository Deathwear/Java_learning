package Maths_for_DSA;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double x = n;    // in the starting we are taking x as also as an root.
        double root;     // initialized root for scoping purpose at the end.
        while (true){
            root = 0.5 * ( x + (n/x));   // this executes as always and we are needed to minimize error only

            if (Math.abs(root-x) < 0.5){   // this is for precision as the error value is lees than 0.5.
                break;   // when error becomes less than 0.5 while loop breaks.
            }

            x = root;  // while loop continues
        }
        return root;
    }
}

/*   Basically if:
            root = 0.5 * (x + (n/x))  this is the newton's formula for finding square root of x
            the error here is error = |root - x| and hence we need to minimize the value of error to get the precise value of root

it has a time complexity of fast fourier transform.
 */

