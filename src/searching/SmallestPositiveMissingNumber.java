package searching;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {

    public static void run(int[] arr){

        int n = arr.length;

        System.out.println(Arrays.toString(arr));
        for(int i=0 ; i < n ; i++){
            if(arr[i] < 0 || arr[i] > n){
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));
        for(int i=0 ; i < n ; i++){
            int newIndex = (arr[i] - 1)%n;
            arr[newIndex] += n;
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i < n ; i++){
            if(arr[i] <= n){
                System.out.println(i+1);
                return ;
            }

        }

        System.out.println(n+1);



    }


}
