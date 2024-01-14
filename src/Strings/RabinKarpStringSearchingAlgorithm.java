package Strings;

import java.util.HashSet;

public class RabinKarpStringSearchingAlgorithm {

    /*
    *
    *
    * We compare hash values of windows and if they match then only they compare characters
    *
    *
    * -> In this code we have not done but divide with modulo q becoz the number might be big becoz of powers
    *
    * -> Time complexity is O((m-n+1)*n) - worst case , but on averge netter
    *
    *
    * -> it is used practically when you have multiple patterns to be searched in a text.
    *
    * */

    public static void run(String text , String pat){
        int d = 5;

        char[] textArr = text.toCharArray();
        char[] patArr = pat.toCharArray();

        int m = textArr.length;
        int n = patArr.length;

        int p = hashFunction(pat.toCharArray() , n , d);

        int window = hashFunction(textArr ,  n , d);

        for(int i=0; i < m-n+1; i++){
            if(window == p && compareStrings(textArr , patArr , i)){
                System.out.println("Pattern matched at index : " + i);
            }

            if(i < m-n){
                window = d * (window - textArr[i]*((int)Math.pow(d,n-1))) + textArr[i+n];
            }

        }

    }

    public static boolean compareStrings(char[] text , char[] pat , int pos){
        for(int i = 0 ; i < pat.length ; i++){
            if(text[i+pos] != pat[i]){
                return false;
            }
        }

        return true;
    }

    public static int hashFunction(char[] charArray , int patLen , int d){
        int sum = 0;

        for(int i=0; i< patLen ; i++){
            sum =  sum*d + charArray[i];
        }

        return sum;
    }
}
