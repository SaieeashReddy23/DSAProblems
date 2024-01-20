package Strings;

public class ModifiedString {

    /*
    *
    * Ishaan is playing with strings these days. He has found a new string. He wants to modify it as per the following rules to make it valid:
    * The string should not have three consecutive same characters (Refer example for explanation).
    * He can add any number of characters anywhere in the string.
    * Find the minimum number of characters which Ishaan must insert in the string to make it valid.
    *
    * */

    public static void run(String s){

        System.out.println(modified(s));

    }

    public static long modified(String s){
        // Your code here

        if(s.length()< 2){
            return 0;
        }

        long tobeAdded = 0;

        long count = 1;

        char prev = s.charAt(0);

        for(int i=1; i< s.length(); i++){
            char curr = s.charAt(i);

            if(prev == curr){
                count++;
                if(count == 3){
                    tobeAdded++;
                    count=1;
                }
            }else{
                count=1;
            }

            prev=curr;
        }

        return tobeAdded;
    }

}
