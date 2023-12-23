package arrays;

import java.util.Arrays;

public class FreqOfLimitedRangeArrayNumbers {

//    To do Mind panicheyatle
    public static void run(int[] arr){

        int n = arr.length;


        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i< n ; i++){
            if(arr[i] > n){
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<n ; i++){
            arr[i]--;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("tracking values in index");

        for(int i = 0 ; i < n ; i++){
            int newIndex = (arr[i]) % n;
            arr[newIndex] += n;
            System.out.println(Arrays.toString(arr));
        }
//
//        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i <  n ; i++){
                arr[i] = arr[i]/n;
        }

        System.out.println(Arrays.toString(arr));

    }
}
