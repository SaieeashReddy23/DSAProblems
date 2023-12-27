package sorting;

import java.util.Arrays;

public class UnionOfTwoSortedArrays {

//    The union should be in sorted order and there should be no repeating elements
    public static void run(int[] arr1 , int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;


        int[] res = new int[n1+n2];


        int i=0;
        int j=0;
        int k=0;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        while(i < n1 && j < n2){
            if( i > 0 && arr1[i] == arr1[i-1] ){
                i++;
                continue;
            }

            if( j > 0 && arr2[j] == arr2[j-1] ){
                j++;
                continue;
            }

            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            }else if (arr1[i] > arr2[j]) {
                res[k] = arr2[j];
                j++;
                k++;
            }else{
                res[k] = arr1[i];
                i++;
                j++;
                k++;
            }

        }

        while(i < n1){
            if(i > 0 && arr1[i-1] != arr1[i]){
                res[k] = arr1[i];
                k++;
            }
            i++;
        }

        while( j < n2){
            if(j > 0 && arr2[j-1] != arr2[j]){
                res[k] = arr2[j];
                k++;
            }
            j++;
        }

        System.out.println(Arrays.toString(res));

    }
}
