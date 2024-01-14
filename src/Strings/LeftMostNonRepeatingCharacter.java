package Strings;

public class LeftMostNonRepeatingCharacter {

    public static void run(String s) {
        System.out.println(effSol(s));
    }

    public static int lmnrc(String s) {
        int[] charCount = new int[256];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

//    in one trsaversal , eff sol
    public static int effSol(String s){

        boolean[] visited = new boolean[256];

        int res = -1;

        for(int i=s.length()-1; i>=0; i--){
            if(!visited[s.charAt(i)]){
                res = i;
            }

            visited[s.charAt(i)] = true;
        }

        return res;

    }
}
