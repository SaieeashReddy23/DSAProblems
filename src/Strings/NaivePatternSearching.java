package Strings;

public class NaivePatternSearching {

    public static void run(String s , String pat){

        patternMatchingWithDistinctPatternChars(s,pat);
    }


    public static void patternMatchingNaive(String s , String pat){
        int m = s.length();
        int n = pat.length();

        for(int i=0; i < m-n+1 ;i++){

            int k = i;
            int j = 0;

            while(j < n && k < m && s.charAt(k) == pat.charAt(j)){
                k++;
                j++;
            }

            if(j==n){
                System.out.println("Pattern matched at index " + i);
            }
        }
    }

//    Improved naive approach if we have distinct characters in pattern

    public static void patternMatchingWithDistinctPatternChars(String s , String pat){

        int m = s.length();
        int n = pat.length();

        for(int i=0; i < m-n+1 ;){

            int k = i;
            int j = 0;

            while(j < n && k < m && s.charAt(k) == pat.charAt(j)){
                k++;
                j++;
            }

            if(j==n){
                System.out.println("Pattern matched at index " + i);
            }

            if(j==0){
                i++;
            }else{
                i = i + j;
            }
        }

    }
}
