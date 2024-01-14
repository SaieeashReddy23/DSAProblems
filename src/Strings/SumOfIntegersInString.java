package Strings;

public class SumOfIntegersInString {

    public static void run(String s){
        System.out.println(sum(s));
    }

    public static int sum(String str){

        int sum = 0;

        int i=0;
        while(i < str.length()){
            int temp = 0;
            while( i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                int val = (int)(str.charAt(i) - '0');
                temp = temp*10 + val;
                i++;
            }

            sum += temp;

            i++;
        }

        return sum;
    }
}
