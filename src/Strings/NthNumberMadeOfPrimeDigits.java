package Strings;

public class NthNumberMadeOfPrimeDigits {

    public static void run(int n){
        System.out.println(primeDigits(n));
    }

    public static int primeDigits(int n){
        int i = 1;
        int count = 0;

        while(count < n){
            i++;
            if(isEachDigitPrime(i)){
                count++;
            }
        }


        return i;

    }

    public static boolean isEachDigitPrime(int n){

        int[] arr = {2,3,5,7};

        while(n > 0 ){

            int curr = n%10;
            n=n/10;

            boolean isPresent = false;

            for(int i=0; i< arr.length; i++){
                if(arr[i] == curr){
                    isPresent = true;
                    break;
                }
            }

            if(!isPresent){
                return false;
            }


        }

        return true;
    }

}
