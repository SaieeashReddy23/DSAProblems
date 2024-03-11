package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class ShortestPathInDag {

    /*
    *
    *
    * Idea :-
    *   -> Each edge will have weights which will tell us the distance between nodes
    *   -> Do topological sort
    *   -> Create a dist array with int max values
    *   -> now for the source vertex , keep that distance to 0
    *
    *   -> now traverse through all the vertexes in topological sort
    *
    *               -> for the adjacent vertexes of each vertex ,
    *
    *                           check if adjacent vertex is greater than the vertex of topolical sort distance  + weight of edge
    *
    *                           -> make that adjacent vertex distance  = sum of distance of u + wight (u,v)
    *
    * Time complexity : O(V+E)
    *
    * Note :-
    *      -> The graph should not have cycles
    * */
    public static void run(GraphAdjacencyListWithWeights graph,int souce){
        int v = graph.getArr().size();
        int[] dist = new int[v];
        for(int i=0; i< v; i++){
            dist[i] =Integer.MAX_VALUE;
        }

        dist[souce] = 0;

        ArrayList<Integer> topoSort  = topologicalSort(graph);

        for(Integer i : topoSort){
            for(GraphAdjacencyListWithWeights.Edge adj : graph.getArr().get(i)){
                if(dist[adj.vertex] > dist[i] + adj.weight ){
                    dist[adj.vertex] = dist[i] + adj.weight;
                }
            }
        }

        for(int i=0; i < v;i++ ){
            System.out.print(dist[i] + " , ");
        }
    }

//    We will use dfs approach
    public static ArrayList<Integer> topologicalSort(GraphAdjacencyListWithWeights graph){
        int v = graph.getArr().size();
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< v; i++){
            if(!visited[i]){
                recDfs(graph , i , visited , stack);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (!stack.isEmpty()){
            arr.add(stack.pop());
        }
        return arr;
    }

    private static void recDfs(GraphAdjacencyListWithWeights graph , int source ,   boolean[] visited, Stack<Integer> stack){
        visited[source] = true;
        for(GraphAdjacencyListWithWeights.Edge adj : graph.getArr().get(source)){
            if(!visited[adj.vertex]){
                recDfs(graph , adj.vertex , visited , stack);
            }
        }
        stack.push(source);
    }
}
