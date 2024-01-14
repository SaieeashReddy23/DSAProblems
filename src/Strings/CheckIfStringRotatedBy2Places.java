package Strings;

public class CheckIfStringRotatedBy2Places {

    public static void run(String s1 , String s2){

        int index = s1.concat(s1).indexOf(s2);

        System.out.println(index);

        if(index == 2 || index == s2.length()-2){
            System.out.println("Yes it is roated by 2");
        }else {
            System.out.println("Not rotated xactly 2 times");
        }
    }

}
