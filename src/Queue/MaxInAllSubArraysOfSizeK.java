package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MaxInAllSubArraysOfSizeK {

    public static void run(int[] arr,int k){

        Deque<Integer> dq = new LinkedList<>();

        for(int i=0 ; i< k ; i++){
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(int i=k ; i< arr.length; i++){
            System.out.print(arr[dq.peek()] + "  ,  ");
            while(!dq.isEmpty() && dq.peek() <= i-k){
                dq.removeFirst();
            }


            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);

        }

        System.out.print(arr[dq.peek()]);



    }
}
