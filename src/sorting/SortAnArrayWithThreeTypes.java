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

        int pos = 0;
        int lastPos = arr.length-1;

        System.out.println(Arrays.toString(arr));

        for(int i=0; i< arr.length;i++){
            if(pos >= lastPos){
                break;
            }

            if(arr[i] < 1){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }else if (arr[i] > 1 ){
                int temp = arr[i];
                arr[i] = arr[lastPos];
                arr[lastPos] = temp;
                lastPos--;
            }
        }

        System.out.println(Arrays.toString(arr));



    }
}
