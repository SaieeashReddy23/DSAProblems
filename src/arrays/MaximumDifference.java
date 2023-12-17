package arrays;

public class MaximumDifference {


//   a[j] - a[i] ,   max diff between 2 elements in array such that  where j > i
//    Time complexity O(n)
    public static void run(int[] arr){

        int res = arr[1] - arr[0];
        int min = arr[0];

        for(int i=1;i<arr.length ; i++){
             res = Math.max(res , arr[i] - min);
             min = Math.min(arr[i], min);
        }

        System.out.println(String.format("max difference for the array is %d",res ));

    }
}
