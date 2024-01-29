package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbersWithGivenDigits {

//    Hvaing 5,6

    public static void run(int n){


        Queue<String> queue = new LinkedList<>();


        queue.offer("5");

        queue.offer("6");

        int curr = 0;

        while(curr < n){
            String temp = queue.poll();
            System.out.print(temp + "   ,   ");
            queue.offer(temp + "5");
            queue.offer(temp + "6");
            curr++;
        }


    }



}
