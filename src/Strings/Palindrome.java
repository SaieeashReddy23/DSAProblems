package Strings;

public class Palindrome {

    public static void run(String s){

        if(isPalindrome(s)){
            System.out.println(s + " is a palindrome");
        }else{
            System.out.println(s + " is not a palindrome");
        }

    }

    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;

        while(l <= r){

            int leftChar = s.charAt(l);
            int rightChar = s.charAt(r);

            if(leftChar != rightChar){
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

}
