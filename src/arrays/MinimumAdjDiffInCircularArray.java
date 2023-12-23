package arrays;

public class MinimumAdjDiffInCircularArray {

    public static void run(int[] arr){

        int minDiff = Integer.MAX_VALUE;

        for(int i=0 ; i < arr.length ; i++){
            int diff = Math.abs(arr[i] - arr[(i+1) % arr.length]);
            minDiff = Math.min(diff , minDiff);
        }

        System.out.println(minDiff);
    }

}
