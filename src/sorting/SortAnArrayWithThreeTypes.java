package sorting;

import java.util.Arrays;

public class SortAnArrayWithThreeTypes {

    /*
    * types:-
    *
    *       1.sort an array of 0's,1's,2's
    *
    *       2.Three way partitioning, piviot : 2
    *
    *           Elements < pivot left side and elements >pivot rightside
    *
    *
    *       3.partition around a range , ex: {5,10} , left side have < 5 elemtns and right side having > 10 elemnts
    *
    *
    *
    *  We use a standard alagorithm called (DUTCH National flag Algorithm)
    *
    *
    * */


    public static void run(int[] arr){

       int low = 0;
       int mid = 0;
       int high = arr.length-1;

        System.out.println(Arrays.toString(arr));

       while(mid <= high){
           if(arr[mid] < 1){
               swap(arr , low,mid);
               low++;
               mid++;

           }else if (arr[mid] == 1){
               mid++;

           }else{
               swap(arr , mid , high);
               high--;
           }
       }

        System.out.println(Arrays.toString(arr));


    }


    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
