package math;

public class PrimeFactors {

    public static void run(int n){
        int primeNumer = 1;
        while(n > 1){
            primeNumer = getNextPrimeNumber(primeNumer);
            while(true){
                if(n%primeNumer != 0){
                    break;
                }
                n = n/primeNumer;
                System.out.print(primeNumer + " , ");
            }
        }
    }

    public static int getNextPrimeNumber(int k ){
        while(true){
            k++;
            if(Prime.isPrime(k)){
                break;
            }
        }
        return k;

    }


    public static void effSol(int n){

        if(n == 1){
            return;
        }

        while(n % 2 == 0){
            System.out.print(2 + " , ");
            n = n/2;
        }

        while(n % 3 == 0){
            System.out.print(3 + " , ");
            n = n/3;
        }

        for(int i = 5 ; i*i <= n ; i = i + 6){
            while(n%i == 0){
                System.out.print(i + " , ");
                n = n/i;
            }
            while (n % (i+2) == 0){
                System.out.print((i+2) + " , ");
                n = n/(i+2);
            }
        }

        if(n > 3){
            System.out.print(n);
        }



    }


}
