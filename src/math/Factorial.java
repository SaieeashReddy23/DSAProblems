package math;

public class Factorial {

//    Time complexity of this is O(n)
    public static void run(int n){

        int original = n;
        int t = 1;

        while(n > 0){
            t = t * n;
            n=n-1;
        }

        System.out.println("Factorial of " + original + " is " + t );
    }

    public static void recursiveRun(int n){

        int fac = fact(n);

        System.out.println("Factorial of " + n + " is " + fac );

    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int retVal = n * fact(n-1);
        return retVal;
    }


}
