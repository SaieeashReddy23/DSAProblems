package heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MergeKSorteArrays {


    /*
    *
    * idea :-
    *
    *   -> store in a min heap of objects haveing -  value , position of array and position of value
    *
    *   -> fetch min , and then insert the next value in that array
    *
    *
    * */

    static class ArrayVal {
        int val;
        int posOfArray;
        int posOfValue;

        public ArrayVal(int val , int posOfArray , int posOfValue){
            this.val = val;
            this.posOfArray = posOfArray;
            this.posOfValue = posOfValue;
        }
    }


    public static void run(int[][] arr){
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<ArrayVal> pq = new PriorityQueue<>((a,b) -> a.val - b.val );

        pq.add(new ArrayVal(arr[0][0],0,0));
        pq.add(new ArrayVal(arr[1][0],1,0));
        pq.add(new ArrayVal(arr[2][0],2,0));

        while(!pq.isEmpty()){
            ArrayVal arrayVal = pq.poll();
            res.add(arrayVal.val);
            if(arrayVal.posOfValue + 1 < arr[arrayVal.posOfArray].length){
                int newPos = arrayVal.posOfValue + 1;
                int val = arr[arrayVal.posOfArray][newPos];
                pq.add(new ArrayVal(val , arrayVal.posOfArray , newPos));
            }
        }

        System.out.println(res.toString());
    }
}
