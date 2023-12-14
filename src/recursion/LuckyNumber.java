package recursion;

public class LuckyNumber {

    public static void run(int n){

        int val = isLucky(n , 1);

        System.out.println(val);
    }


    /*
    *
    * for each iteration n is moved from its origial position
    *
    * */
    public static int isLucky(int n ,int counter){

        if( counter > n){
            return 1;
        }

        if(n%counter == 0){
            return 0;
        }

//        newPositions after shifting

        int newPos = n - n/counter;

        counter++;
        return isLucky(newPos ,  counter );

    }
}
