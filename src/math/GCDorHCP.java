package math;

public class GCDorHCP {

//    There is a relation between GCD problem and tiling problem

//    if you form a rectange or floor of size a*b , then the  largest square tile we can place to fill the whole floor is GCD .

//    Normal layman approch  ,  just find the max comman number which can divider both the number
//    So  take a min of two numbers and from there in decrement - 1 , try to find if a number divides both a and b , that is the GCD


//    Here below we are using Euclid algoithm

    /*
    Basic idea is  if b is smaller than a

    Gcd(a , b) = gcd(a-b , b)

    Tell that you dont know the proof , but GCD of 2 numbers will be  , the smae as GCD of smaller number and rem of max/min

    *  */



//    Time complexity of this O(log(min(a, b)))  , becoz when we divide , the remainder is typically less than half of divisor , so for each step divifing the problem by half

    public static void run(int a , int b){
        int divider = Math.min(a, b);
        int divident = Math.max(a, b);
        while(divider > 0){
            int rem = divident % divider;
            divident = divider;
            divider = rem;
        }
        System.out.println("Hcp or GCD of " + a + " and " + b + " is " + divident);
    }


    public static void recursiveRun(int a , int b){

        int val = gcd(a, b);

        System.out.println("Hcp or GCD of " + a + " and " + b + " is " + val);

    }

    public static int gcd(int a , int b){
        if(b == 0){
            return a;
        }

        return gcd(b , a%b);
    }


}
