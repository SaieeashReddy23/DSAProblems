package math;

public class Power {

//    Time complexity is  O(n)
    public static void run(int x , int n){
        int original = n;
        int pow = 1;
        while( n > 0){
            pow = pow*x;
            n--;
        }
        System.out.println(String.format("%d power %d is %d", x, original , pow));
    }



//    Time complxity is O(logn) but taking more space
    public static void effSol(int x, int n){
        int val = pow(x , n);

        System.out.println(String.format("%d power %d is %d", x, n , val));

    }



//    It will run in logn and space complexity is also constant

//    bit values of power , 4^5 we can write as = 0101 = 4^3 * 0  , 4^2 , 4^1 , 4^0

//                                                        4^3 * 4^1

    public static void iterativeEffSol(int x , int n){
        int originalX = x;
        int orriginalN = n;

        int res = 1;

        while( n > 0){
            if(n%2 != 0){
//                bit 1
                res = res * x;
            }else{
//                bit 0
            }
            n=n/2;
            x=x*x;
        }

        System.out.println(String.format("%d power %d is %d", originalX, orriginalN , res));

    }



    public static int pow(int x , int n){
        if(n == 1 ){
            return x;
        }

        int val;
        if(n%2 == 0){
            val = pow(x , n/2);
            val = val*val;
        }else{
            val = pow(x , n-1)*x;
        }
        return val;

    }



}
