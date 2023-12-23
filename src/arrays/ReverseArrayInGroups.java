package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayInGroups {

    public static void run(int[] arr, int k){

        int l = 0;
        int r = k-1;

        System.out.println(Arrays.toString(arr));

        while(l < arr.length){
            rev(arr , l , r);
            l = l + k;
            r = r + k;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void rev(int[] arr , int l , int r){

        System.out.println(String.format("Left = %d and right = %d", l , r));

        if(r > arr.length - 1){
            r = arr.length - 1;
        }

        while( l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
