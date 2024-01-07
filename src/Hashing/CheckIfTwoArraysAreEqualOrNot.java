package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysAreEqualOrNot {

    public static void run(long[] A , long[] B) {

        if(areEqual(A , B)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

    }

    public static boolean areEqual(long A[] , long B[]){
        //Your code here
        HashMap<Long ,Integer> map = new HashMap<>();

        for(int i=0; i< A.length ; i++){
            map.put(A[i], map.getOrDefault(A[i],0) + 1);
        }

        for(int i=0; i< B.length ; i++){
            if(!map.containsKey(B[i])){
                return false;
            }

            int val = map.get(B[i]);

            if(val == 0){
                return false;
            }

            map.put(B[i],val-1);
        }

        for(Map.Entry<Long , Integer> e : map.entrySet()){
            if(e.getValue() != 0){
                return false;
            }
        }

        return true;
    }
}
