package arrays;

public class LongestEvenOaddSubarray {

    public static void run(int[] arr){

        int res = 1;
        int count = 1;
        int i;
        for(i=1;i<arr.length;i++){
            if((arr[i]%2 == 0 && arr[i-1]%2 != 0 ) || (arr[i]%2 == 1 && arr[i-1]%2 != 1  )){
                count++;
                res = Math.max(res , count);
            }else{
                count = 1;
            }
        }


        System.out.println(res);

    }
}
