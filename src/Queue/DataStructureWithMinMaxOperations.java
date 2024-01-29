package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DataStructureWithMinMaxOperations {

    private Deque<Integer> dq;

    public DataStructureWithMinMaxOperations(){
        dq = new LinkedList<>();

        Queue<Integer> q = new LinkedList<>();
    }


    public void insertMin(int x){
        dq.offerFirst(x);
    }

    public void insertMax(int x){
        dq.offerLast(x);
    }

    public int getMin(){
       return  dq.peekFirst();
    }
    public int getMax(){
        return dq.peekLast();
    }




    public int extractMin(){
        return dq.removeFirst();
    }


    public int extractMax(){
        return dq.removeLast();

    }




}
