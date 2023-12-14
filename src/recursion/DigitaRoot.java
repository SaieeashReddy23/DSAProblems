package recursion;

public class DigitaRoot {

    public static void run(int n){
        int retval = digitalRoot(n);

        System.out.println(retval);
    }


    public static int digitalRoot(int n){
//        basecase
        if(n > 0 && n < 10){
            return n;
        }

//        Recurisve
        return digitalRoot(digitsCount(n));
    }

    public static int digitsCount(int n){
        int sum = 0;

        while(n > 0){
            sum = sum + n%10;
            n=n/10;
        }

        return sum;

    }


}

