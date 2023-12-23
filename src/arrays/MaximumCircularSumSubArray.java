package arrays;

public class MaximumCircularSumSubArray {


//   Idea - find max sum of normal arr and then find max sum of circular sub array

//    Below you are using KADANE's algorithm
    public static void run(int[] arr){


        int normalSubArray = normalSubArraySum(arr);

        if(normalSubArray < 0){
            return ;
        }
        int circularSubArray = maxCirucualrSubArraySum(arr);

        System.out.println(Math.max(normalSubArray , circularSubArray));

    }

    public static int normalSubArraySum(int[] arr){

        int res = arr[0];
        int maxEnding = arr[0];

        for(int i=1;i < arr.length ; i++){
            maxEnding = Math.max(maxEnding + arr[i] , arr[i]);

            res = Math.max(res , maxEnding);
        }

        return res;
    }


//       idea : if you find min sum the you can remove it from total sum and get max sum in curcular array

//      you can find min sum , by inverting all elements and then using kadane algoritm , maxsum =  min sum of inverted elments

    public static int maxCirucualrSubArraySum(int[] arr){

        int sum = 0;

        for(int i=0;i < arr.length ; i++){
            sum = sum + arr[i];
        }

        int minEnding = arr[0];

        int res = arr[0];

        for(int i=1; i< arr.length;i++){
            minEnding = Math.min(minEnding + arr[i] , arr[i]);
            res = Math.min(res , minEnding);
        }

        return  sum-res;
    }

}
