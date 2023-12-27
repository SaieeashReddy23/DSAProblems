package sorting;

import java.util.Arrays;

public class MinDiffInArray {

//    Time complexity - O(nlogn)
    public static void run(int[] arr){
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for(int i=0 ; i< arr.length-1; i++){
            min = Math.min(min ,arr[i+1] - arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(min);


    }
}
