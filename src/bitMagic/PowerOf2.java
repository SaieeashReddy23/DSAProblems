package bitMagic;

public class PowerOf2 {


//    Naive solution
    public static void run(int n){

        if(isPowerof2(n)){
            System.out.println(String.format("%d is a power of 2",n));
        }else{
            System.out.println(String.format("%d is not a power of 2",n));
        }

    }

    public static boolean isPowerof2(int n){
        if(n == 1){
            return true;
        }
        while(n%2==0){
            n=n/2;
        }
        if(n==1){
            return true;
        }else{
            return  false;
        }

    }


    public static void effSol(int n){
        if(n == 0){
            System.out.println(String.format("%d is not a power of 2",n));
            return;
        }
        if((n&n-1) == 0){
            System.out.println(String.format("%d is a power of 2",n));
        }else{
            System.out.println(String.format("%d is not a power of 2",n));
        }
    }

}
