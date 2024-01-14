package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryString {

    /*
    * Idea is count the no of 1's in the string then by using formula of (n*(n-1)/2) gives the no of
    * substring with starting and ending as 1
    *
    *
    * how we got the formula is : if thee are n 1's in string then if starting 1 is picked then it will have n-1 pairs as endpoints
    * then for second 1 it will have n-2 ends , similarly for other if you count them it will be summation.
    *
    *
    * */
    public static void run(String s){

        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
        }

        System.out.println((count*(count-1))/2);
    }


}
