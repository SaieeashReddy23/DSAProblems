package searching;

import java.util.Arrays;

public class TwoRepeatedElements {

    public static void run(int[] arr){

        int[] res = new int[2];

        int k = 0;

        int n = arr.length;

        for(int i=0 ; i < n;i++){
            int abs_Val = Math.abs(arr[i]);
            if(arr[abs_Val] > 0){
                arr[abs_Val] = -arr[abs_Val];
            }else{
                res[k] = abs_Val;
                k++;
            }
        }

        System.out.println(Arrays.toString(res));


    }
}
