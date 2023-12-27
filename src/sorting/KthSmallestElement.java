package sorting;

import java.util.Arrays;

public class KthSmallestElement {

//    You can use a lomuto partition and quick sort technique , worst case will bne O(n^2) , but on average it is linear

    public static void run(int[] arr , int k){

        int l = 0 ;
        int r = arr.length-1;


        while(l <=r){
            int p = partition(arr , l , r);
            if(p==k-1){
                System.out.println(arr[p]);
                return ;
            }else if (p > k-1){
                r = p-1;
            }else {
                l = p+1;
            }
        }

        System.out.println("Not found");
    }

    public static int partition(int[] arr , int l , int r){

        int pivot = arr[r];

        int pivPos = l;

        for(int i=l; i<= r-1 ; i++){
            if(arr[i] < pivot){
               int temp = arr[i];
               arr[i] = arr[pivPos];
               arr[pivPos] = temp;
               pivPos++;
            }
        }

        int temp = arr[pivPos];
        arr[pivPos] = arr[r];
        arr[r] = temp;


        return pivPos;
    }

}
