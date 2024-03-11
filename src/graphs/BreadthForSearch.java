package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthForSearch {

    /*
    *
    *
    * You can use hashmap or a booleanArray to know whether v is visite or not
    *
    * and also a queue
    *
    *
    * */

    public static void run(GraphAdjacencyList list , int source){

        Queue<Integer> queue = new LinkedList<>();

        HashSet<Integer> set = new HashSet<>();

        queue.add(source);
        set.add(source);

        while(!queue.isEmpty()){
            int val = queue.poll();

            System.out.print(val + " , ") ;

            ArrayList<Integer> arrayList = list.getArr().get(val);

            for(int i=0; i < arrayList.size() ; i++){
                if(!set.contains(arrayList.get(i))){
                    queue.add(arrayList.get(i));
                    set.add(arrayList.get(i));
                }
            }
        }

    }

//Visited array is used
    public static void effSOl(GraphAdjacencyList list , int source){

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[list.getArr().size()];

        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()){
            int val = queue.poll();

            System.out.print(val + " , ") ;

            ArrayList<Integer> arrayList = list.getArr().get(val);

            for (Integer integer : arrayList) {
                if (!visited[integer]) {
                    queue.add(integer);
                    visited[integer] = true;
                }
            }
        }

    }


    /*
    * In this scenario , graph may be disconnedted and you dont know source , how do you traverse through all vertices
    *
    *
    * Time complexity is going to be = O(V+E)
    *
    *
    * */

    public static void scenario2(GraphAdjacencyList list ){

        int v = list.getArr().size();
        boolean[] visited = new  boolean[v];

        for(int i=0; i<v; i++ ){
            if(!visited[i]){
                bfs(list , i , visited);
            }
        }

    }

    public static void bfs(GraphAdjacencyList list , int source , boolean[] visited ){

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;

        while(!queue.isEmpty()){
            int val = queue.poll();

            System.out.print(val + " , ") ;

            ArrayList<Integer> arrayList = list.getArr().get(val);

            for (Integer integer : arrayList) {
                if (!visited[integer]) {
                    queue.add(integer);
                    visited[integer] = true;
                }
            }
        }
    }


    /*
    *
    * count connected components , meaning islands:-
    *
    * */

    public static void scenario3(GraphAdjacencyList list ){

        int v = list.getArr().size();
        boolean[] visited = new  boolean[v];

        int count = 0;

        for(int i=0; i<v; i++ ){
            if(!visited[i]){
                count++;
                bfs(list , i , visited);
            }
        }


        System.out.println("No of islands : " + count );

    }








}
