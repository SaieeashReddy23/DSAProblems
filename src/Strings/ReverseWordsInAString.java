package Strings;

public class ReverseWordsInAString {

    public static void run(String s){

        char[] charArr = s.toCharArray();

        System.out.println(s);

        int start = 0;

        for(int i=0; i< charArr.length; i++){

            if(charArr[i] == ' '){
                reverse(charArr , start , i-1);
                start = i+1;
            }

        }

        reverse(charArr , start , charArr.length - 1);


        reverse(charArr , 0 , charArr.length - 1);

        System.out.println(new String(charArr));

    }

    public static void reverse(char[] charArr, int start , int end){

        while(start <= end){
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start++;
            end--;
        }
    }
}
