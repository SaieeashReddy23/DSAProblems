package Hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

//    use prefix sum and hashing

    public static void run(int[] arr){

       if(isSumExist(arr)){
           System.out.println("Exists");
       }else{
           System.out.println("does not exist");
       }

    }

    public static boolean isSumExist(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        int presum = 0;
        for(int i=0; i< arr.length;i++){
            presum += arr[i];
            if(set.contains(presum)){
                return true;
            }

            if(presum == 0){
                return true;
            }
            set.add(presum);
        }

        return false;
    }
}
