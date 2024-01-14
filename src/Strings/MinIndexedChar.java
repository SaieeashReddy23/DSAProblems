package Strings;

public class MinIndexedChar {

    public static void run(String s , String pat){

        System.out.println(minIndexChar(s,pat));
    }

    public static int minIndexChar(String str , String patt){
        boolean[] isPresentInPatt = new boolean[256];

        for(char c : patt.toCharArray()){
            isPresentInPatt[c] = true;
        }

        for(int i=0; i< str.length(); i++){
            if(isPresentInPatt[str.charAt(i)]){
                return i;
            }
        }

        return -1;
    }

}
