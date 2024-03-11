package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSorting {

    /*
    *
    * in a directed graph , there will be dependency , child should be executed only after parent is done
    *
    * We can use BFS
    *
    *       -> store in degrees of each vertex
    *       -> in a queue add all vertexes whose indegree is 0
    *
    *
    * -> now till queue is empty
    *           -> after popping each one , reuce indegree for its adjecent by 1
    *
    *           -> when indegree is 0 , then add to queue
    *
    *
    * _Time compelxity : O(V+E)
    *
    *   This algorithm is also known as khans algorithm
    *
    *
    * Note :- This topological sort algorithm is only for acyclic graphs
    *           -> for cyclic graphs it will fail
    *
    *
    * */

    public static void run(GraphAdjacencyList list){
        dfs(list);
    }

    public static void bfs(GraphAdjacencyList list){
        int v = list.getArr().size();
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();

        int[] indegree = new int[v];

//        Store indegree of each vertex

        for(ArrayList<Integer> arr : list.getArr()){
            for(Integer i : arr){
                indegree[i]++;
            }
        }

        for(int i=0; i< v; i++){
            if(indegree[i] == 0){
                queue.add(i);
                visited[i] = true;
            }
        }

        int count = 0;

        while(!queue.isEmpty()){
            int val = queue.poll();

            count++;
            System.out.print(val + " , ");

            for(Integer i : list.getArr().get(val)){
                indegree[i]--;
                if( !visited[i] && indegree[i] == 0){
                    queue.add(i);
                }
            }
        }


        System.out.println();
        System.out.println("Count is : " + count);

    }


    /*
    *
    * Solution for this is , we will use a stack , and a normal dfs approach in which after all its decendents we will
    *
    *           push this vertex into its stack
    *
    * Then printing the stack
    *
    *
    * */

    public static void dfs(GraphAdjacencyList list){
        int v = list.getArr().size();
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i< v; i++){
            if(!visited[i]){
                recDfs(list , i , visited , st);
            }
        }

        System.out.println();
        while(!st.isEmpty()){
            System.out.print(st.pop() + " , ");
        }

        System.out.println();

    }

    public static void recDfs(GraphAdjacencyList list , int source ,boolean[] visited ,  Stack<Integer> st){

        visited[source] = true;

        for(Integer i : list.getArr().get(source)){
            if(!visited[i]){
                recDfs(list , i , visited , st);
            }
        }

        st.push(source);


    }
}
