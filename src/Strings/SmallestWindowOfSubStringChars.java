package Strings;

public class SmallestWindowOfSubStringChars {

    public static void run(String s, String p) {
        StringBuilder sb = new StringBuilder();

        int[] wArr = new int[26];
        int[] pArr = new int[26];

        for(char c : p.toCharArray()){
            pArr[c-'a']++;
        }

        int start = 0;

        int finalStartPos = 0;;
        int finalEndPos = 0;

        int minWindowLength = Integer.MAX_VALUE;


        for(int end = 0; end < s.length() ; end++){
            char c = s.charAt(end);
            wArr[c-'a']++;

            while(isWindowContainingPatternChars(wArr , pArr , p )){

                if(minWindowLength > end-start+1){
                    finalStartPos = start;
                    finalEndPos = end;
                    minWindowLength = end-start+1;
                }

                char startChar = s.charAt(start);
                wArr[startChar - 'a']--;
                start++;

            }

        }

        if(minWindowLength == Integer.MAX_VALUE ){
            System.out.println("-");
            return;

        }

        for(int i = finalStartPos ; i <= finalEndPos ; i++){
            sb.append(s.charAt(i));
        }

        System.out.println(sb);
    }

    public static boolean isWindowContainingPatternChars(int[] wArr ,int[] pArr ,  String p){

        for(char c : p.toCharArray()){
            if(wArr[c-'a'] < pArr[c-'a']){
                return false;
            }
        }

        return true;
    }
}
