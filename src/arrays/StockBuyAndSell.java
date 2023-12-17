package arrays;

public class StockBuyAndSell {

    /*
    * see it like stock graph , buy at lows and sell at peaks
    *
    * with the below conditions , when the next day is higher than todays prices we accumulate the gains
    *
    * in that way we can get all the profit we could have generated in this period
    *
    * */

    public static void run(int[] arr){


        int res = 0;


        for(int i=1;i<arr.length ; i++){
            if(arr[i] > arr[i-1]){
                res = res + arr[i] - arr[i-1];
            }
        }

        System.out.println("max profit is " + res);

    }
}
