package arrays;

import java.util.Arrays;

public class ReArrangeArrayAlternatively {

    /*
    *
    * arr[i] += (arr[right] % maxElement) * maxElement; -  use this formaula to  store an element
    *
    * */
    public static void run(int[] arr){

        int n = arr.length;

        int maxElement = arr[n-1] + 1;

        int left = 0;
        int right = n-1;


        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i< n; i++){
            if(i%2 == 0){
                arr[i] += (arr[right]%maxElement)*maxElement;
                right--;
            }else{
                arr[i] += (arr[left]%maxElement)*maxElement;
                left++;
            }
        }


        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i < arr.length ;i++){
            arr[i] = arr[i]/maxElement;
        }

        System.out.println(Arrays.toString(arr));

    }
}
