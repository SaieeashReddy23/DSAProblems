package math;

public class Prime {


//    A number is prime if it is divided by itself and 1 . Other numbers are called composite numbers

//    is is neither prime nor composite

    public static void run(int n){
        if(isPrime(n)){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }
    }


//    This is the efficient solution
    public static boolean isPrime(int n) {

        if(n ==1){
            return false;
        }

        if(n==2 || n==3){
            return true;
        }

        if(n%2 == 0 || n%3 ==0){
            return false;
        }

        for(int i=5 ; i <= Math.sqrt(n) ; i = i + 6 ){

            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }

        return true;
    }


}
