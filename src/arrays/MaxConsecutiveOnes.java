package arrays;

public class MaxConsecutiveOnes {

    public static void run(int[] arr){

        int maxConsOnes = 0;

        int count = 0;

        for(int i=0;i<arr.length ;i++){
            if(arr[i] == 0){
                maxConsOnes = Math.max(maxConsOnes , count);
                count = 0;
            }else{
                count++;
            }

        }

        maxConsOnes = Math.max(maxConsOnes , count);



        System.out.println("Max no of consecutive ones is " + maxConsOnes);

    }
}
