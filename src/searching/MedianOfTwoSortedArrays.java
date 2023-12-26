package searching;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void run(int[] arr1 , int[] arr2){

        median(arr1,arr2);
    }

    public static int median(int[] arr1 , int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0 , j = 0 , k = 0;

        int[] combined = new int[n1 + n2];

        while( i < n1 && j < n2){
            if( arr1[i] < arr2[j]){
                combined[k] = arr1[i];
                k++;
                i++;
            }else{
                combined[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < n1){
            combined[k] = arr1[i];
            i++;
            k++;
        }

        while( j < n2){
            combined[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(combined));

        if(combined.length%2 == 0){
            int l = combined[combined.length/2];
            int m = combined[combined.length/2 - 1];
            System.out.println((double)(l+m)/2);
        }else{
            System.out.println(combined[combined.length/2]);
        }

        return 0;
    }

}
