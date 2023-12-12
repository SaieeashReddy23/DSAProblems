package math;

public class CountDigits {


//    Time complexity of this one is O(l)
//    Where l is the length or number of digits in a number
    public static void run(int n){

        int originialValue = n;

        int count = 0;

        while(n > 0){
            n = n/10;
            count++;
        }

        System.out.println(originialValue + " number is having " + count + " digits .");

    }

}
