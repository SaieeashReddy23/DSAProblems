package Hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void run(int[] arr){

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            set.add(arr[i]);
        }

        int max = 1;


        for(int i : set){
            if(set.contains(i-1)){
                continue;
            }

            int curr = 1;

            while(set.contains(i+1)){
                curr++;
            }

            if(max < curr){
                max = curr;
            }
        }

        System.out.println(max);
    }

}
