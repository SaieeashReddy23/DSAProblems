package Strings;

import java.util.Arrays;

public class LeftMostRepeatingCharacter {

    public static void run(String s){

        System.out.println(effSol2(s));
    }


    public static int lmrc(String s){
        int[] charCount = new int[256];
        for(int i=0; i < s.length(); i++){
            charCount[s.charAt(i)]++;
        }
        for(int i=0; i< s.length();i++){
            if(charCount[s.charAt(i)] > 1){
                return i;
            }
        }
        return -1;
    }



//    This approch will iterate the string only once
    public static int effSol(String s){

        int[] charSeenArr = new int[256];

        Arrays.fill(charSeenArr,-1);

        int res = Integer.MAX_VALUE;

        for(int i=0; i< s.length();i++){

            int index = charSeenArr[s.charAt(i)];

            if( index != -1){
                res = Math.min(res,index);
            }else{
                charSeenArr[s.charAt(i)] = i;
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;

    }


    public static int effSol2(String s){

        boolean[] visited = new boolean[256];

        int res = -1;
        for(int i = s.length()-1; i>=0 ; i--){
            char c = s.charAt(i);

            if(visited[c]){
                res = i;
            }else{
                visited[c] = true;
            }
        }

        return res;

    }
}
