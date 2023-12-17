package arrays;

import java.util.Arrays;

public class MaxSubArraySum {

    /*
    * if all numbers are positive numbers then it will be sum of all numbers
    *
    * if array has -ve numbers then it becomes tricky
    *
    *
    * if you can observe - max of ending i = max (max(i-1) + curr[i]  or curr[i])
    *
    * */

    public static void run(int[] arr){

        int res  = arr[0];
        int maxEnding = arr[0];

        for(int i=1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding + arr[i] , arr[i]);
            res = Math.max(res , maxEnding);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(res);


    }
}
