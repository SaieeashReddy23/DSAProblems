package Hashing;

import java.util.HashMap;

public class CountNoOfSubArraysWithGivenSum {

    public static void run(int[] arr , int sum){


        HashMap<Integer , Integer> map = new HashMap<>();

//        Handles subArrays starting from the index 0  whose sum is equal to our required
        map.put(0,1);


        int currSum = 0;
        int res = 0;

        for(int i=0; i< arr.length ; i++){
            currSum += arr[i];

            if(map.containsKey(currSum - sum)){
                res +=  map.get(currSum-sum);
            }

            map.put(currSum , map.getOrDefault(currSum , 0) + 1);

            System.out.println("currsum value " + currSum + " times " + map.get(currSum));
        }

        System.out.println(res);
    }
}
