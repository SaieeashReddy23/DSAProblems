package Strings;

import java.util.HashMap;

public class IsoMorphic {

    /*
    * If the characters in str1 can be changed to get str2, then two strings, str1 and str2, are isomorphic.
    *  A character must be completely swapped out for another character while maintaining the order of the characters.
    *  A character may map to itself, but no two characters may map to the same character.
    * */

    public static void run(String s1 , String s2){

        if(isIsoMorphic(s1,s2)){
            System.out.println("They are isomporthic");
        }else{
            System.out.println("they are not isomorphic");
        }

    }

    public static boolean isIsoMorphic(String s1 , String s2){

        HashMap<Character , Character> map = new HashMap<>();

        if(s1.length() != s2.length()){
            return false;
        }

        for(int i=0; i< s1.length(); i++){

            if(map.containsKey(s1.charAt(i))){

                char c = map.get(s1.charAt(i));
                if(c != s2.charAt(i) ){
                    return false;
                }


            }else if ( map.containsValue(s2.charAt(i))) {
                map.put(s1.charAt(i),s2.charAt(i));
            }else{
                return false;
            }
        }

        return true;



    }

}
