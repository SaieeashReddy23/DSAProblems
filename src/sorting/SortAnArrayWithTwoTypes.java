package sorting;

import java.util.Arrays;

public class SortAnArrayWithTwoTypes {

    /*
    * 1. Segerate positives and negatives
    *
    * 2. segregate binaries
    *
    * 3.segregate evens and odds
    *
    *
    * order doesnot matter in individual types
    *
    *
    * */


    public static void run(int[] arr){

        int pos = 0;

        System.out.println(Arrays.toString(arr));

        for(int i=0; i< arr.length; i++){

            if(arr[i]%2 == 0){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }

        }

        System.out.println(Arrays.toString(arr));


    }
}
