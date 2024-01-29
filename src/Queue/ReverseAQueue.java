package Queue;

import java.util.Queue;

public class ReverseAQueue {

    public static void run(Queue<Integer> queue){

        print(queue);

        reverse(queue);

        print(queue);

    }


    public static void reverse(Queue<Integer> queue){

        if(queue.isEmpty()){
            return;
        }

        int x = queue.poll();

        reverse(queue);

        queue.offer(x);
    }

    public static void print(Queue<Integer> queue){
        queue.forEach((e) -> System.out.print(e + "  "));
        System.out.println();
    }


}
