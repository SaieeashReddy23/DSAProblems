package arrays;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces {

    //    Time complexity is O(n)
    public static void run(int[] arr , int d){

        System.out.println("Original Array "  + Arrays.toString(arr));
        rev(arr , 0 , d-1);
        System.out.println(String.format("after rotating  upto %d ",d) + Arrays.toString(arr));
        rev(arr , d , arr.length - 1);
        System.out.println(String.format("after rotating after %d",d) + Arrays.toString(arr));
        rev(arr , 0 , arr.length - 1);
        System.out.println(String.format("after rotating the arr by %d it is",d) + Arrays.toString(arr));

    }

    public static void rev(int[] arr , int low , int high){

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

    }
}
