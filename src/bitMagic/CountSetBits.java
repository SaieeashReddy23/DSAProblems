package bitMagic;

public class CountSetBits {



//    This is a naive solution
    public static void run(int x){

        int original = x;

        int count = 0;
        while(x != 0){
            if(x%2 != 0){
                count++;
            }
            x = x/2;
        }

        System.out.println(String.format("No of set bits in %d is %d", original , count));

    }


//    This is algorithm is called brian cunningum algorthm
//    It is runs just the no of set bit times , O(1)
//
//    n = n&(n-1) , what it does it it sets the least set having 1 to 0

    public static void effSol(int x){
        int original = x;

        int count = 0;
        while(x != 0){
           x = x & (x-1);
           count++;
        }

        System.out.println(String.format("No of set bits in %d is %d", original , count));

    }


//    This does in O(1) time , precompute the set bits for each number from 1 to 255 and then reuse that value for the while 32 bit
//    segment number by dividing the whole number to blocks of 8
    public static void moreEffSol(int x){
        int retVal = setBits(x);
        System.out.println(String.format("No of set bits in %d is %d", x , retVal));
    }

    public static int setBits(int x){

        int[] table = new int[256];

        for(int i=1;i<256 ; i++){
            table[i] = table[i&(i-1)] + 1;
//            System.out.println(String.format("For %d  no of set bits is %d",i , table[i]));
//            System.out.println(String.format("For %d  brian cunningum value  is %d",i , i&(i-1)));
        }
//
//        System.out.println(String.format("For %d  no of set bits is %d",0, table[0]));

        int retVal = table[x&255] + table[x>>8&255] + table[x>>16&255] + table[x>>24&255];

        return retVal;
    }
}
