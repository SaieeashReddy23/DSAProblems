package arrays;

import java.util.Arrays;

//Example anothe problem , weighted sum se it in videos
public class PrefixSum {

    public static void run(int[] arr){
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for(int i=1;i < arr.length;i++){
            pref[i] = pref[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(pref));
        System.out.println(getSum(pref , 2, 5));
    }

    public static int getSum(int[] pref , int l , int r){
        if(l == 0){
            return pref[r];
        }
        return pref[r] - pref[l];
    }
}
