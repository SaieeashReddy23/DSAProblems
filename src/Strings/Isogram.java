package Strings;

public class Isogram {

    public static void run(String s){

        if(isIsogram(s)){
            System.out.println("it is an isogram");
        }else{
            System.out.println("it is not an isogram");
        }

        StringBuilder sb = new StringBuilder();

    }


    public static boolean isIsogram(String s){

        char[] count = new char[256];

        for(char c : s.toCharArray()){
            count[c]++;

            if(count[c] > 1){
                return false;
            }
        }

        return true;
    }
}
