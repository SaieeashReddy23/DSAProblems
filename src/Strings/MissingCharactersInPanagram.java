package Strings;

public class MissingCharactersInPanagram {


    public static void run(String s){
        System.out.println(missing(s));
    }

    public static String missing(String str){
        int[] arr = new int[26];

        for(char c : str.toCharArray()){
            if(c >= 'A' && c <='Z'){
                arr[c-'A']++;
            }

            if(c >='a' && c <='z'){
                arr[c-'a']++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<26; i++){
            if(arr[i] == 0){
                sb.append((char)(i+'a'));
            }
        }

        if(sb.length() > 0){
            return new String(sb);
        }

        return "-1";

    }
}
