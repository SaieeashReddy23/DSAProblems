package math;

public class AllDivisors {

    public static void run(int n){
        int i;
        for(i = 1  ; i <= n ; i++ ){
            if(n%i == 0){
                System.out.print(i + " , ");
            }
        }

        for( ; i >= 1 ; i++ ){
            if(n%i == 0){
                System.out.print(n/i + " , ");
            }
        }
    }
}
