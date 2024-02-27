package heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArray {


    /*
    *
    * Problem : Given an array of N elements, where each element is at most K away from its target position,
    * devise an algorithm that sorts in O(N log K) time.
    *
    *
    * idea :-
    *       -> create a min heap upto k elements , and for each index poll
    *
    * */
    public static void run(int[] arr,int k){

        System.out.println(Arrays.toString(arr));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i< k;i++){
            pq.add(arr[i]);
        }

        int index = 0;

        for(int i=k;i < arr.length ;i++){
            arr[index] = pq.poll();
            pq.add(arr[i]);
            index++;
        }

        while(index < arr.length){
            arr[index] = pq.poll();
            index++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
