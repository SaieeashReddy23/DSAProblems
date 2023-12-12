package bitMagic;

public class BitWiseOperations {
    /*
    * Binary representation of negative numbers , IN most languages we store negative numbers as 2's compliment , other ways , 1's compliment and signed
    * if it supports -ve numbers then if size is n then range is -2^n-1  to 2^n-1 - 1
    * 2's compliment :-
    *
    *       -> invert all bits and then add 1
    *
    *       -> Directformula : 2^n - x
    *
    *                   -> if representation of -3 in binary then  2"32-1  - 3
    *
    * -> Advantages of 2's compliment is easier to do arithmetic operations.
    * */





    public static void run(int x ,int y){
        bitWiseAnd(x, y);
        bitWiseOR(x,y);
        bitWiseXOR(x,y);
        bitWiseNot(x);
        bitwiseLeftShift(x);

    }


    /*
    * if x, y = 3 , 6
    *
    * 3 = 000...11
    * 6 = 0000 110
    *=================
    * 2 = 00000010
    *
    *
    * AND - if both bits 1 then only result 1
    * */

    public static void bitWiseAnd(int x, int y){
        System.out.println(String.format("The bitwise and of %d and %d is %d", x , y , x&y));
    }


    /*
     * if x, y = 3 , 6
     *
     * 3 = 000...11
     * 6 = 0000 110
     *=================
     * 2 = 00000111
     *
     *
     * if one of the bit is 1 then the result is 1
     *
     * */

    public static void bitWiseOR(int x, int y){
        System.out.println(String.format("The bitwise OR of %d and %d is %d", x , y , x|y));
    }


    /*
     * if x, y = 3 , 6
     *
     * 3 = 000...11
     * 6 = 0000 110
     *=================
     * 5 = 00000101
     *
     *
     * if both bits are differnet then result is 1
     *
     * */

    public static void bitWiseXOR(int x, int y){
        System.out.println(String.format("The bitwise XOR of %d and %d is %d", x , y , x^y));
    }


    /*
    * ~ - this one basically inverts all the bits , we store -ve number values as 2's compliment
    *
    * so x = 2  , 000......10
    *   ~x = 2^32-1-2   , 1111.....01
    *
    *
    * we know that ins 2's compliment representation -x = 2^32 - x
    *
    *
    * there fore , 2^32-1-2  ==== -3
    *
    *
    * So basiclaly , not operatior will convert your number to a -ve number
    *
    * therfre ~2 = -3
    * */

    public static void bitWiseNot(int x){
        System.out.println(String.format("The bitwise Not of %d  is ", x) + (~x));
    }


    /*
     * if x = 3
     *
     * x << 1
     *
     * 3 = 000...11
     *=================
     * 6 = 0000   110
     *
     *
     * it will be  basically a multiplication of x by 2 as many times as it shifts
     *
     *
     *
     *
     * if x = -1 = 2^32 - 1
     *           = 111111......11
     * X<<1
     *             => 111.....10  => 2^32 - 1 -1  = -2
     *
     * X<<2
     *             => 1111....00 ==> 2^32 - 1 - 3  = -4
     *
     *
     *
     *
     *
     *
     *
     * */
    public static void bitwiseLeftShift(int x){

        System.out.println(String.format("The bitwise Left shift of %d  is %d ", x , (x << 1)));
    }


    /*
     * if x = 3
     *
     * x >> 1
     *
     * 3 = 000...11
     *=================
     * 1 = 000....01
     *
     *
     * it will be  basically a Divison of x by 2 as many times as it shifts for +ve numbers
     *
     *
     *
     *
     * for -ve numbers , for signedRight shift , the leading bits will be replaced by 1 not 0
     * if x = -5 = 2^32 - 5
     *           = 111111......011
     * X>>1
     *             => 111.....1101  => 2^32 - 1 -2  = -3
     *
     * X>>2
     *             => 1111....10 ==> 2^32 - 1 -1  = -2
     *
     * */
    public static void bitwiseSignedRightShift(int x){

        System.out.println(String.format("The bitwise Signed Right shift of %d  is %d ", x , (x >> 1)));
    }


    /*
     * if x = 3
     *
     * x >> 1
     *
     * 3 = 000...11
     *=================
     * 1 = 000....01
     *
     *
     * it will be  basically a Divison of x by 2 as many times as it shifts for +ve numbers
     *
     *
     *
     *
     * for -ve numbers , for Unsigned shift , the leading bits will be replaced by  0 not 1
     * if x = -5 = 2^32 - 5
     *           = 111111......011
     * X>>1
     *             => 011.....1101  => 2^31 - 1 -2  = 2^31 - 3
     *
     * X>>2
     *             => 0011....10 ==> 2^30 - 1 -1  = 2^30 - 2
     *
     * */
    public static void bitwiseUnSignedRightShift(int x){

        System.out.println(String.format("The bitwise Signed Right shift of %d  is %d ", x , (x >>> 1)));
    }

}
