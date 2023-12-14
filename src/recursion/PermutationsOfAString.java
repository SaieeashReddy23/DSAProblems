package recursion;

public class PermutationsOfAString {

    /*
    * For a String of length n there will be n! (factorial) permutations
    *
    * for example : "abc"
    *
    *   => abc  , acb , bac , bca , cab , cba
    *
    * */
    public static void run(String s){

        StringBuilder stringBuilder = new StringBuilder(s);

        permut(stringBuilder , 0);

    }

    public static  void permut(StringBuilder s , int fixPos){

//        basecase
        if(fixPos == s.length() - 1){
            System.out.println(s);
            return;
        }

        for(int j = fixPos ; j < s.length(); j++ ){
//            Pre
            swap(s , fixPos, j);

//            Recursive
            permut(s , fixPos +1 );

//            Post
            swap(s , j , fixPos);
        }

    }

    public static  void swap (StringBuilder s , int i , int j){
        char temp = s.charAt(i);
        s.setCharAt(i , s.charAt(j));
        s.setCharAt(j , temp);
    }


}
