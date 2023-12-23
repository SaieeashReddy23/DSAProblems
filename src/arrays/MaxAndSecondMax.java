package arrays;

import java.util.Arrays;

public class MaxAndSecondMax {

    public static void run(int[] arr){
        int max =  Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0 ; i< arr.length ; i++){
            if( max < arr[i]){
                max = arr[i];
            }
        }

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i] != max && secondMax < arr[i] ){
                secondMax = arr[i];
            }
        }

        if(max == secondMax){
            return ;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(secondMax);



    }
}
