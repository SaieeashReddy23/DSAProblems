package searching;

import java.util.Arrays;

public class CountOnlyRepeated {


    public static void run(int[] arr){

       repeated(arr);
        System.out.println(arr.length - (arr[arr.length-1]- arr[0]-1));
    }

    public static int repeated(int[] arr){


        System.out.println(Arrays.toString(arr));
        int l = 0;
        int r = arr.length - 1;

        while(l < r ){

            int mid = l + (r-l)/2;

            if(arr[mid] >= mid + arr[0]){
                System.out.println("mid pos " + mid);
                System.out.println("considering right half");
                l = mid + 1;
            }else{
                System.out.println("mid pos " + mid);
                System.out.println("considering left half");
                r = mid;
            }
        }

        System.out.println(arr[l]);

        return -1;
    }

}
