package searching;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceGreaterThanNByK {

    public static void run(int[] arr, int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        int x = arr.length/k;

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > x){
                System.out.println(e.getKey());
            }
        }





    }
}
