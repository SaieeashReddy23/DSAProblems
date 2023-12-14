package recursion;

public class PowerOfNumbers {

    public static void run(int n){

        int reverse = rev(n);

        System.out.println(String.format("rever of %d is %d", n , reverse));

        long powVal = pow(n , reverse);

        System.out.println(String.format("Power  of %d power %d is %d", n , reverse , powVal));
    }

    public static int rev(int n){
        int rev = 0;
        while( n > 0){
            rev = rev*10 + n%10;
            n=n/10;
        }

        return rev;
    }

    public static long pow(int x , int n){

        if(n == 1){
            return x;
        }

        long temp = 0;

        if(n%2 == 0){

            temp = pow(x , n/2) % 1000000007;

            temp = temp*temp  % 1000000007;

        }else{

            temp = pow(x , (n-1))  % 1000000007;

            temp = temp*x  % 1000000007;

        }

        return temp % 1000000007;
    }


}
