package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {

    public static void run(int[] arr , int sum){

        if(isPairExist(arr , sum)){
            System.out.println("Present");
        }else{
            System.out.println("Not present");
        }

    }


    public static boolean isPairExist(int[] arr , int sum){

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            if(set.contains( sum -  arr[i])){
                return true;
            }
            set.add(arr[i]);
        }


        return false;
    }
}
