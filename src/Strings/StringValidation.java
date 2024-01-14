package Strings;

public class StringValidation {


    /*
    * String must have the length greater than or equal to 10.
    * String must contain at least 1 numeric character.
    * String must contain at least 1 uppercase character.
    * String must contain at least 1 lowercase character.
    * String must contain at least 1 special character from @#$-*.
    * */

    public static void run(String s){

        if(isValid(s)){
            System.out.println("It is a valid passowrd");
        }else {
            System.out.println("No it is not a valid password");
        }

    }


    public static boolean isValid(String str){

        char[] count = new char[256];

        if(str.length() < 10){
            return false;
        }

        for(char c : str.toCharArray()){
            count[c]++;
        }

        //   check for atleast one numeric character


        boolean isNumeric = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialChar = false;


        for(int i=0; i< 256; i++){
            if(isNumeric && isUpperCase && isLowerCase && isSpecialChar){
                return true;
            }

            if(!isSpecialChar && count['@'] > 0 || count['#'] > 0 || count['$'] > 0 || count['-'] > 0){
                isSpecialChar = true;
            }

            if( !isNumeric && i >= '0' && i <= '9' && count[i] > 0){
                isNumeric = true;
            }

            if( !isLowerCase && i >= 'a' && i <= 'z' && count[i] > 0){
                isLowerCase = true;
            }

            if( !isUpperCase && i >= 'A' && i <= 'Z' && count[i] > 0){
                isUpperCase = true;
            }

        }


        if(isNumeric && isUpperCase && isLowerCase && isSpecialChar){
            return true;
        }

        return  false;
    }
}
