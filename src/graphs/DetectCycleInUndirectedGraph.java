package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInUndirectedGraph {


    /*
    *
    *
    * idea :- Normal dfs search , when vertex is already visited then we say a cycle is detected
    *
    *          -> A corner case should be covered , that is parent should not be the verex
    *
    *
    *
    * */


    public static void run(GraphAdjacencyList list){

        if(method2(list)){
            System.out.println("Cycle is deteced");
        }else{
            System.out.println("Cycle is not detected");
        }
    }

    public static boolean isCycleDetected(GraphAdjacencyList list){

        int v = list.getArr().size();
        boolean[] visited = new boolean[v];

        for(int i=0; i< v ; i++){
            if(!visited[i]){
                if(dfs(list , i , visited , -1)){
                    return true;
                }
            }
        }

        return false;

    }


    public static boolean dfs(GraphAdjacencyList list , int source , boolean[] visited,int parent){

        visited[source] = true;

        for(Integer i : list.getArr().get(source)){
            if(!visited[i] ){
                if(dfs(list , i , visited,source)){
                    return true;
                }
            }else if (i != parent){
                return true;
            }
        }

        return false;
    }


//    Using topologic sorting  (Kahns algorithm)

    public static boolean method2(GraphAdjacencyList list ){
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

            for(Integer i : list.getArr().get(val)){
                indegree[i]--;
                if( !visited[i] && indegree[i] == 0){
                    queue.add(i);
                }
            }
        }

        return count != v;

    }


}
