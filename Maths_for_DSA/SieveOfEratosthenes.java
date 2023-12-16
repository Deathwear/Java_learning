package Maths_for_DSA;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];   // creating extra space here. (space complexity)
        System.out.println(primes[0]);  // initially, primes contain all the values will be false.
        sieve(n, primes);
    }

    // false in array means number is prime.
    // and make all the multiple of these numbers to true
    static void sieve(int n, boolean[] primes){  //starting the SoE (Sieve Of Eratosthenes)
        for (int i = 2; i <= n; i++) {   // here n = 40;
            if (!primes[i]){
                for (int j = i*2; j <= n ; j+=i) {   // making the multiples of that i as not prime.
                    primes[j] = true;    // means they are included in the not prime.
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if (!primes[i]){   // primes[i] == false ;  false are considered prime here.
                System.out.print(i + " ");
            }
        }
    }
}
