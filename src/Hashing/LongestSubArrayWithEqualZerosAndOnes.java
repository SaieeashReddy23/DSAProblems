package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithEqualZerosAndOnes {

    public static void run(int[] arr){

        for(int i=0; i< arr.length; i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        int prefix = 0;
        int maxLen = 0;

        for(int i=0; i< arr.length ; i++){
            prefix += arr[i];
            if(prefix == 0){
                maxLen++;
            }

            if(!map.containsKey(prefix)){
                map.put(prefix , i);
            }else{
                maxLen = Math.max(maxLen , i - map.get(prefix));
            }
        }

        System.out.println(maxLen);

    }
}
