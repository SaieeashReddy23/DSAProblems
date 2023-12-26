package searching;

import java.util.Arrays;

public class TwoPointerApproach {

//    Find if there is a pair with sum in this sorted array
    public static void run(int[] arr , int sum){

        System.out.println(Arrays.toString(arr));
        System.out.println(sum);

        System.out.println(isSumAvl(arr , sum));
    }

    public static boolean isSumAvl(int[] arr , int sum){
        int poiA = 0;
        int poiB = arr.length - 1;

        while(poiA < poiB) {
            if(arr[poiA] + arr[poiB]  == sum){
                return true;
            } else if(arr[poiA] + arr[poiB] > sum ){
                poiB--;
            }else{
                poiA++;
            }
        }

        return false;
    }
}
