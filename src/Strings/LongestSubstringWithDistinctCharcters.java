package Strings;

public class LongestSubstringWithDistinctCharcters {

    public static void run(String s){
        System.out.println(lsWdc(s));

        for(char c : s.toCharArray()){

        }
    }


//    Time complexity O(n^2)

    public static int lsWdc(String s){
        int res = 0;


        for(int i=0; i < s.length(); i++){

            boolean[] visited = new boolean[256];

            for(int j=i; j < s.length();j++){

                if(visited[s.charAt(j)]){
                    break;
                }else{
                    res = Math.max(res , j-i+1);
                    visited[s.charAt(j)] = true;
                }
            }
        }

        return res;
    }


//    Effsol not able to understad look one more time
}
