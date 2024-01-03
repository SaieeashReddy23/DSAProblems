package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubArrayWithGivenSum {

    public static void run(int[] arr,int sum){


        HashMap<Integer , Integer> map = new HashMap<>();

        int presum = 0;

        int maxLen = 0;


        for(int i=0; i< arr.length;i++){
            presum += arr[i];
            if(presum == sum){
                maxLen++;
            }

            if(!map.containsKey(presum)){
                map.put(presum, i);
            }


            if(map.containsKey(presum - sum)){
                maxLen = Math.max(maxLen , i - map.get(presum-sum) );
            }

        }

        System.out.println(maxLen);

    }
}
