package bitMagic;

public class OddOccuringNumber {

//    Do xor of all numbers
    public static void singlOddNumber(int[] arr){
        int result = arr[0];
        for(int i=1;i < arr.length ; i++){
            result = result ^ arr[i];
        }
        System.out.println(String.format("%d is the odd occuring number", result));
    }

    /*
    *
    * Do xor of all the numbers in the array
    * find the frst setbit from right , and try to find the match of all the number with that bit and do xor of those
    * and now find all the numbers for whom that bit is not set and do xor of all those numbers ,
    *
    * this will give you your 2 odd occuring numbers
    *
    *
    *
    * */
    public static void twoOddNumbers(int[] arr){

        int xor = 0;
        for(int i=1;i < arr.length ; i++){
            xor = xor ^ arr[i];
        }

        int positionOfSetBit = 1;

        while(xor > 0){
            if(xor%2 == 1){
                break;
            }
            xor = xor>>1;
            positionOfSetBit++;
        }


//        Important one , temp is the only bit having the first set bit;

        int temp = xor & ~(xor - 1);

//        int temp = 1 << (positionOfSetBit-1);
        int xor1 = 0;
        int xor2 = 0;

        for(int i=0;i < arr.length ; i++){
            if((temp & arr[i]) != 0){
                xor1 = xor1 ^ arr[i];
            }else{
                xor2 = xor2 ^ arr[i];

            }
        }

        int first = xor1;
        int second = xor2;


        System.out.println(String.format("The two odd occuring numbers are %d and %d", first  , second));
    }
}
