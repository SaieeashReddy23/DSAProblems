package arrays;

public class FrquenciesInSortedArray {

    public static void run(int[] arr){

        int count = 1;

        int i;
        for(i=0;i < arr.length-1 ; i++){

            if(arr[i] != arr[i+1]){
                System.out.println(String.format("count of %d is %d", arr[i] , count));
                count = 1;
            }else{
                count++;
            }
        }

        System.out.println(String.format("count of %d is %d", arr[i] , count));

    }
}
