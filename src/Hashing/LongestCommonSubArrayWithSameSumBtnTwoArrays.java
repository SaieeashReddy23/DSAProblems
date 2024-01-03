package Hashing;

import java.util.HashMap;

public class LongestCommonSubArrayWithSameSumBtnTwoArrays {

    public static void run(int[] arr1 , int[] arr2){

        int[] temp = new int[arr1.length];

        for(int i=0; i< arr1.length;i++){
            temp[i] = arr1[i] - arr2[i];
        }


//        longest zero sum code

        HashMap<Integer,Integer> map = new HashMap<>();
        int presum = 0;
        int maxLen = 0;
        for(int i=0; i< temp.length ; i++){
            presum += temp[i];

            if(presum == 0){
                maxLen++;
            }

            if(!map.containsKey(presum)){
                map.put(presum , i);
            }else{
                maxLen = Math.max(maxLen , i - map.get(presum) );
            }
        }

        System.out.println(maxLen);

    }
}
