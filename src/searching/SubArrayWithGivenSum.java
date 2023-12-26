package searching;

import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static void run(int[] arr, int s){

        int i=0;
        int end=0;

        int[] res = new int[2];

        int currSum = 0;

        while( end < arr.length){

            currSum += arr[end];

            while(currSum > s && i <=end){
                currSum -= arr[i];
                i++;
            }

            if(currSum == s && i <=end){
                res[0] = i+1;
                res[1] = end+1;
                break;
            }

           end++;

        }

        System.out.println(Arrays.toString(res));




    }

}
