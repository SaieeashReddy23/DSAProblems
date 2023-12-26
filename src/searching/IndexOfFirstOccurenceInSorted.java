package searching;

import java.util.Arrays;

public class IndexOfFirstOccurenceInSorted {

    public static void run(int[] arr , int x){

        int val = binarySearch(arr , x);
        System.out.println("To find " + x);
        System.out.println(Arrays.toString(arr));
        if(val == -1){
            System.out.println("Not found");
        }

        System.out.println(" Found at position : " + val );


    }

    public static int binarySearch(int[] arr , int x){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;

//            if(arr[mid] == x){
////                do something
//                while(mid-1 >= 0 && arr[mid-1] ==x){
//                    mid--;
//                }
//                return mid;
//            }

            if(arr[mid] > x){
                high = mid-1;
            }else if (arr[mid] < x){
                low = mid + 1;
            }else {
                if(mid == 0 || arr[mid-1] != x){
                    return mid;
                }else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}
