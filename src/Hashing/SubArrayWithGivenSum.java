package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

//    use prefix sum and hashing
    public static void run(int[] arr , int sum){

        if(isItExist(arr , sum)){
            System.out.println("Exist");
        }else{
            System.out.println("Not exist");
        }


    }

    public static boolean isItExist(int[] arr , int sum){
        HashSet<Integer> set = new HashSet<>();


        int prefix = 0;

        for(int i=0; i< arr.length;i++){
            prefix += arr[i];

            if(set.contains(prefix - sum)){
                return  true;
            }

            if(prefix == sum){
                return true;
            }

            set.add(prefix);
        }

        return  false;


    }
}
