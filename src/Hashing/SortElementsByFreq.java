package Hashing;

import java.util.*;
import java.util.stream.Collectors;

public class SortElementsByFreq {

    public static void run(int[] arr){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list , (x,y) -> {
            int f1 = map.get(x);
            int f2 = map.get(y);

            if(f1 != f2){
                return f2-f1;
            }else{
                return x - y;
            }
        });


        System.out.println(list);
    }
}
