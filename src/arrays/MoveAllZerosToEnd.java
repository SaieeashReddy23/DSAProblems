package arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {


//    Time complexity is O(n)
    public static void run(int[] a){

        System.out.println(Arrays.toString(a));
        int count  = 0;

        for(int i=0; i< a.length ; i++){
            if(a[i] != 0){
                swap(a , i , count);
                count++;
            }
        }

        System.out.println(Arrays.toString(a));

    }

    public static void swap(int[] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
