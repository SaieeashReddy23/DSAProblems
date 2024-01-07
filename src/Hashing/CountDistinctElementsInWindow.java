package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElementsInWindow {

    public static void run(int[] arr, int k){


        HashMap<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;

        for(i=0; i<k; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }

        while(i < arr.length){
            list.add(map.size());

            if(map.containsKey(arr[i-k])){
                int val = map.get(arr[i-k]) - 1;
                if(val==0){
                    map.remove(arr[i-k]);
                }else{
                    map.put(arr[i-k] , map.get(arr[i-k]) - 1);
                }
            }
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
            i++;
        }

        list.add(map.size());

        System.out.println(list);









    }
}
