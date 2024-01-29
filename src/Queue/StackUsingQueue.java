package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public StackUsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x){
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());

        }

        queue1.add(x);

        while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }

    public void pop(){
       queue1.remove();
    }


    public void print(){
        queue1.forEach((e) -> System.out.println(e));
    }

}
