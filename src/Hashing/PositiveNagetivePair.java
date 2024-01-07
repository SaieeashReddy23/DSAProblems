package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PositiveNagetivePair {

//    You can use HashSet also
    public static void run(int[] arr){


        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.asList(arr);
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){

            if(map.containsKey(-1*arr[i])){
                if(arr[i] < 0){
                    list.add(arr[i]);
                    list.add(-1*arr[i]);
                }else{
                    list.add(-1*arr[i]);
                    list.add(arr[i]);
                }

                map.remove(-1*arr[i]);

            }else{
                map.put(arr[i] , map.getOrDefault(arr[i],0) + 1);
            }
        }
        System.out.println(list);
    }

}
