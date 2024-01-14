package Strings;

public class CheckRotatiionInString {


//    Tell if s2 will be fomded or not by rotating s1 any number of times

//    Idea is concatenate s1 + s1 and in that try to find s2 if it occurs

    public static void run(String s1 , String s2){

        if(s1.length() != s2.length()){
            System.out.println("Not found");
        }

        if((s1+s1).indexOf(s2) > 0){
            System.out.println("Found it");
        }else{
            System.out.println("Not found");
        }

    }

}
