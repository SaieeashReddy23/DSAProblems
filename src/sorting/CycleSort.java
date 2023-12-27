package sorting;

import java.util.Arrays;

public class CycleSort {

    /*
    *
    * Has worst case O(n^2)
    *
    * Does minimum writes , useful when memory write is costly
    *
    * not stable and  in place
    *
    * *****useful in questions where it is asked , minimum number of swaps needed to sort the array.
    *
    *
    *
    *
    * */


    public static void run(int[] arr){

        System.out.println(Arrays.toString(arr));
        int count = 0;

        for(int cs=0; cs < arr.length-1 ; cs++){

            int item = arr[cs];

            int pos = cs;

            for(int i=cs+1; i< arr.length ; i++){
                if(arr[i] < item){
                    pos++;
                }
            }

            int temp = arr[pos];
            arr[pos] = item;
            item = temp;

            System.out.println("Swapping count : " + count);
            count++;

            while(pos != cs){
                pos = cs;

                for(int i = cs+1 ; i< arr.length;i++){
                    if(arr[i] < item){
                        pos++;
                    }
                }

                temp = arr[pos];
                arr[pos] = item;
                item = temp;

                System.out.println("Swapping count : " + count);
                count++;

            }


        }

        System.out.println(Arrays.toString(arr));

    }
}
