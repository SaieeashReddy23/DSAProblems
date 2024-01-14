package Strings;

public class AnagramSearch {

    /*
    * we need to find if pattern is present in text or if any of its permutations present in text
    *
    *
    * */

    public static void run(String text , String patt){

        char[] textArr = new char[256];
        char[] pattArr = new char[256];

        for(int i=0; i< patt.length();i++){
            char textChar = text.charAt(i);
            char pattChar =  patt.charAt(i);

            textArr[textChar]++;
            pattArr[pattChar]++;
        }

        for(int i = patt.length(); i< text.length();i++){

            if(areSame(textArr,pattArr)){
                System.out.println("Found it");
                return;
            }

            textArr[text.charAt(i)]++;
            textArr[text.charAt(i-patt.length())]--;
        }

        System.out.println("Not Found it");

    }


    public static boolean areSame(char[] textArr , char[] pattArr){
        for(int i=0; i < 256; i++){
            if(textArr[i] != pattArr[i]){
                return false;
            }
        }

        return true;
    }
}
