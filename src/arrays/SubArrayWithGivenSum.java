package arrays;

public class SubArrayWithGivenSum {


//    No -ve nnumbers

    public static void run(int[] arr , int sum){

        if(isSumAvailable(arr , sum)){
            System.out.println("yes sum is available");
        }else{
            System.out.println("Sum is not available");
        }
    }


//    Its a varibale window  while sliding , add values till it is less than req sum and if it is more tha req sum  start removing values from start

    public static boolean isSumAvailable(int[] arr , int reqSum){

        int s = 0 ;
        int curr = 0;

        for(int e = 0; e < arr.length;e++){
            curr += arr[e];
            while(curr > reqSum){
                curr -= arr[s];
                s++;
            }
            if(curr == reqSum){
                return true;
            }
        }

        return false;


    }



}
