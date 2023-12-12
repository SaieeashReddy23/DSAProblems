package bitMagic;

public class PowerSet {

    public static void run(String s){

        int n =(int) Math.pow(2 , s.length());



        for(int i=0;i < n ; i++){
            int temp = i;
            int pos = 0 ;
            String t = "";
            while(temp > 0){
                if(temp%2 == 1 ){
                    t = t +s.charAt(pos);
                }
                 pos++;
                temp = temp >> 1;
            }
            System.out.println(t);
        }

    }
}
