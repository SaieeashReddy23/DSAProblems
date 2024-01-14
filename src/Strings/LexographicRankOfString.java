package Strings;

public class LexographicRankOfString {

//    Idea is find the count of lexographically smaller strings + 1

//    This works only for distinct characters

    public static void run(String s){

        char[] charArr = new char[256];

        for(int i=0; i< s.length();i++){
            charArr[s.charAt(i)]++;
        }

        int count = 0;

        for(int i=0; i< s.length();i++){
            char c = s.charAt(i);

            int tempCount = 0;

            for(int j = 0 ; j < c; j++){
                if(charArr[j] > 0){
                    tempCount++;
                }
            }

            charArr[c]--;

            System.out.println("temp count " + tempCount);
            System.out.println("Factorial of " + (s.length() -i-1) );

            System.out.println("***************");

            count += tempCount* fact (s.length() - i - 1);

        }



        System.out.println(count + 1);

    }


    public static int fact(int n){

        if(n==0){
            return 1;
        }

        return n*fact(n-1);

    }
}
