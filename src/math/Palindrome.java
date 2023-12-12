package math;

public class Palindrome {

//    Time complexity of this problem is O(d)
//    Where d is the number of digits.
    public static void run(int n){

        int originalNumber = n;

        int t = 0;

        while(n > 0){
            int rem = n%10;
            n = n/10;
            t = t*10 + rem;
        }

        if(t == originalNumber){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }

    }

}
