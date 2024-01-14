package Strings;

import java.util.Arrays;

public class TwoStringsAnagram {


//    Anagram means , the characters and their freq should be same in both strings but their order may differ

    public static void run(String s1, String s2){

        if(effIsAnagram(s1,s2)){
            System.out.println("it is an anagram");
        }else{
            System.out.println("It is not an anagram");
        }
    }

    public static boolean isAnagram(String s1 , String s2){

        int[] s1CharArr = new int[26];
        int[] s2CharArr = new int[26];

        Arrays.fill(s1CharArr,0);
        Arrays.fill(s2CharArr,0);

        for(int i=0; i< s1.length();i++){
            char c = s1.charAt(i);
            s1CharArr[c - 'a']++;
        }

        for(int i=0; i< s2.length();i++){
            char c = s2.charAt(i);
            s2CharArr[c - 'a']++;
        }

        for(int i=0; i < 26 ; i++){
            if(s1CharArr[i] != s2CharArr[i]){
                return false;
            }
        }

        return true;

    }

    public static boolean effIsAnagram(String s1 , String s2){

        if(s1.length() != s2.length()){
            return  false;
        }

        int[] count = new int[256];


        for(int i=0; i< s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i=0; i< 26 ; i++){
            if(count[i] != 0){
                return  false;
            }
        }

        return true;

    }

}
