package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class FirstCircularTour {

    public static void run(int[] pet , int[] dis){

        bestSol(pet,dis);

    }


    public static void naiveSol(int[] pet , int[] dist){


        for(int start=0; start< pet.length; start++){
            int curr_Pet = 0;
            int end = start;

            while(true){
                curr_Pet += (pet[end] - dist[end]);

                if(curr_Pet < 0){
                    break;
                }

                end = (end+1)%pet.length;

                if(end == start){
                    System.out.println("Strating pos is " + (start+1));
                    return;
                }
            }
        }

    }



    /*
    *
    * Idea - Use a deque , insert if currPetdol is > 0 , if -ve then decque the index in queue , if first and last sam then reached
    *
    * */

    public static void betterSol(int[] pet , int[] dist){

        Deque<Integer> dq = new LinkedList<>();

        int currPet = 0;

        int i = 0;

        while(dq.size() != pet.length){
            currPet += (pet[i] - dist[i]);
            dq.addLast(i);
            while(currPet < 0){
                int index = dq.removeFirst();
                currPet -= pet[index] - dist[index];

            }

            i = (i+1)%pet.length;
        }

        System.out.println(dq.getFirst());

    }



/*
*
*
* Best sol , it works in n operations
*
* it works on the idea that if currPet = per-dis , is -ve then the starting point wont be before that .
*
* */

    public static void bestSol(int[] pet , int[] dist){


        int curr = 0;

        int start = 0;
        int prev = 0;

        for(int i=0; i< pet.length; i++) {
            curr += pet[i] - dist[i];


            if (curr < 0) {
                start = i+1;
                prev = curr;
                curr = 0;
            }
        }


        curr = curr + prev;

        if(curr > 0){
            System.out.println("found the pos at " + (start + 1));
        }else{
            System.out.println("Not found");
        }


    }



}
