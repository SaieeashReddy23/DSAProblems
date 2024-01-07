package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MoreThanNByKOccurences {

//    Print elements whose occurence is more than n/k
    public static void run(int[] arr,int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }

        for(Map.Entry<Integer , Integer> e : map.entrySet()){
            int element = e.getKey();
            int freq = e.getValue();
            if(freq > arr.length/k){
                list.add(element);
            }
        }


        System.out.println(list);

    }



//    sol when n is very large and k is very small in O(nk)


    public static void effSol(int[] arr , int k){


    }


}
