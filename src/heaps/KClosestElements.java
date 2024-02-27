package heaps;

import java.util.*;

public class KClosestElements {

    /*
    *
    * Idea : create a heap ds of absol diff and index of its position
    *
    *       -
    *
    *
    * */

    static class Pair implements  Comparable {
        int diff;
        int pos;

        public Pair(int diff , int pos){
            this.diff = diff;
            this.pos = pos;
        }

        @Override
        public int compareTo(Object o) {
            Pair p = (Pair) o;
            return p.diff;
        }
    }


    public static void run(int[] arr, int x , int k){
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0; i< k ; i++){
            pq.add(new Pair(Math.abs(arr[i] - x),i));
        }

        for(int i=k ; i< arr.length; i++){
            int diff = Math.abs(arr[i] - x);

            assert pq.peek() != null;
            if(pq.peek().diff > diff){
                pq.add(new Pair(Math.abs(arr[i] - x),i));
                pq.poll();
            }
        }

        ArrayList<Integer> ar = new ArrayList<>();

        Collections.sort(ar, Comparator.reverseOrder());



        for(int i=0; i< k ; i++){
            System.out.print(arr[pq.poll().pos] + " , ");
        }


    }

}
