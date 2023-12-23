package arrays;

import java.util.Arrays;

public class MaxSumOfKConsecutiveElements {


//    This is slidiing window technique
    public static void run(int[] arr , int k){

        int kElementsSum = 0;

        for(int i=0;i < k ;i++){
            kElementsSum = kElementsSum + arr[i];
        }

        int res = kElementsSum;

        for(int i=k; i< arr.length ; i++){
            kElementsSum = kElementsSum + arr[i] - arr[i-k];
            res = Math.max(res , kElementsSum);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(res);


    }
}
