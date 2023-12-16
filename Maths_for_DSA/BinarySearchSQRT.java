package Maths_for_DSA;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;     // number of which square root is needed to find
        int p = 3;      // precision value till how many decimal values i wanted
        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;

        while(s<=e){   // Binary search to find the integral value of the root of the number.
            int m = s + (e-s) /2;
            if( m * m == n){
                return m;
            }
            if(m * m > n){
                e = m -1;
            }else{
                s = m + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n){
                root += incr;
            }
            // once it  break means it exceeds its value
            root -= incr;  // now we get de desired output upto 1st decimal place

            incr /= 10;   // now it will find the root till next decimal value. and it increases with every loop break till the precision point we needed.

        }

        return root;
    }
}
