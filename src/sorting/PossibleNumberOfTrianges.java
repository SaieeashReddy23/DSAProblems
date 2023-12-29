package sorting;

import java.util.Arrays;

public class PossibleNumberOfTrianges {

//    if two sides grater than the third side then that can be a triangle


    public static void run(int[] arr){

        Arrays.sort(arr);

        int count = 0;

        for(int i= arr.length-1 ; i >= 1; i--){
            int r = i - 1;;
            count += twoPointer(arr , arr[i] , r);
        }

        System.out.println(count);

    }

    public static int twoPointer(int[] arr , int oneSide, int r){

        int count = 0;
        int l = 0;

        while(l < r){
            if(arr[l] + arr[r] > oneSide){
                count += r-l;
                r--;
            }else{
                l++;
            }
        }

        return count;

    }
}
