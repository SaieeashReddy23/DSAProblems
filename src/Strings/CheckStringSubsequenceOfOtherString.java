package Strings;

public class CheckStringSubsequenceOfOtherString {

//    SubSeequnce is obtained by removing one or more characters

    public static void run(String s1 , String s2){

        if(recSol(s1,s2,s1.length(),s2.length())){
            System.out.println("It is a subsequnce");
        }else{
            System.out.println("It is not a subsequnce");
        }


    }

    public static boolean isSubString(String s1 , String s2){

        StringBuilder sb = new StringBuilder();

        int j = 0;
        for(int i=0; i< s1.length(); i++){
            char s1Char = s1.charAt(i);
            char s2Char = s2.charAt(j);

            if(s1Char != s2Char){
                continue;
            }
            sb.append(s2Char);
            j++;
        }

        if(s2.equals(sb.toString())){
            return  true;
        }

        return false;

    }

/*
* Note :- in String recursive solutions it is better to recurse from the last , becoz we use the string lenght itself
*         instead of using a new param for index
*
* */
    public static boolean recSol(String s1 , String s2 , int m , int n){

        if(n==0){
            return  true;
        }

        if(m == 0){
            return true;
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return recSol(s1,s2,m-1,n-1);
        }else{
            return recSol(s1,s2,m-1,n);
        }

    }
}
