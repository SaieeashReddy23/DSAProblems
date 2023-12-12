package bitMagic;

public class KthBit {

    /*
    *  n = 5 = 000 ...... 101
    *  x = 1  = 000......01
    *
    * x<< 1
    *
    *
    *
    *
    *
    * */
    public static void run(int n , int k){

        int x = 1;

        x = x << (k-1);

        int val = n&x;

        if( val != 0){
            System.out.println(String.format("For %d number , %d th bit is set  " , n , k));
        }else{
            System.out.println(String.format("For %d number , %d th bit is not set  " , n , k));
        }

    }
}
