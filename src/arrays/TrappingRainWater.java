package arrays;

import java.util.Arrays;

public class TrappingRainWater {

    /*
    * get the rightmax and leftmax of a position in seperate arrays and leave the border or corner elements
    * */
    public static void run(int[] arr){

        int res = 0;

        int[] rMax = new int[arr.length];
        int[] lMax = new int[arr.length];

        int max = arr[0];

        for(int i= 0 ; i< arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            lMax[i] = max;
        }

        max = arr[arr.length-1];

        for(int i = arr.length-1 ; i>= 0 ; i--){
            if(arr[i] > max){
                max = arr[i];
            }
            rMax[i] = max;
        }

        for(int i=1;i<arr.length-1;i++){
            res = res + ( Math.min(lMax[i],rMax[i]) - arr[i] );
        }

        System.out.println(res);

    }
}
