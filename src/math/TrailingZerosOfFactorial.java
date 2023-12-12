package math;

public class TrailingZerosOfFactorial {


//   We need to find the number of pairs of 2 and 5 are there in the factorial , based on which we can tell no of trailing zeros

//    As no of 5's will always be less than no of 2's , so we should find no of 5's.

//    Remember , 25 , 125 will have multiple 5's in them .

//    You are just trying to find the no of prime factors of 5.

//    Time complexity is O(n)

    public static void run(int n){
        int original = n;
        int count = 0;
        while(n > 0){
            if(n%5 == 0){
                int temp = n;
                while(temp%5 == 0){
                    temp = temp/5;
                    count++;
                }
            }
            n = n-1;
        }
        System.out.println("Number " + original + " is having " + count + " tailing zeros");
    }



//    when we divide with 5 we get all the 5's , but for 25 we has 2 5's , 125 has 3 5's .

//    When we divide with 5 we get one 5 of all numbers , divide with 25 we get another 5  , so on.....

//    Time complexity O(logn base 5 )
    public static void efficientSol(int n){
        int count = 0;
        for(int i = 5 ; i <= n ; i = i*5){
            count = count + n/i;
        }
        System.out.println("Number " + n + " is having " + count + " tailing zeros");
    }
}
