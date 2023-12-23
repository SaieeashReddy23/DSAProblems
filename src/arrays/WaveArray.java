package arrays;

import java.util.Arrays;

public class WaveArray {

    public static void run(int[] arr){

        int i=0;

        System.out.println(Arrays.toString(arr));

        while(i < arr.length-1){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i=i+2;
        }

        System.out.println(Arrays.toString(arr));

    }
}
