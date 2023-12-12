package math;

import java.util.Arrays;

public class AllPrimeNumbers {

//    Time complexity is O(n*sqrt(n))
    public static void run(int n){

        for(int i=0 ; i <= n ; i++) {
            if(Prime.isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }


//    Sieve of erithrosis

//    Time complexity is O(nloglogn)) - mostly linear


    public static void effSol(int n){
        if(n == 1){
            return;
        }
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime , true);
        for(int i = 2 ; i <= n ; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
                for(int j = i*i ; j <= n ; j = j + i){
                        isPrime[j] = false;
                }
            }
        }
    }
}
