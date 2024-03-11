package graphs;

import java.util.Arrays;

public class BellmanFordShortestPath {

    /*
    *
    * ALgorithms to find shortest path :-
    *
    *       1. Bfs : with no wieights
    *       2. dag : this is applicable for onlye directed acyclic graphs - which has weights
    *       3. djikstras : this applicable for all graphs , but it should not have -ve weights.
    *
    *       4. Bellman ford - this will for all directed , undirected , weighted and also -ve weighed graphs
    *
    *
    *
    *
    *
    * Idea for bellman :-
    *
    *       -> We find shortest paths that are of one edge length. then shortest path of two edge length and so on.
    *       -> Its a dynamic bottom up approach.
    *
    *
    * Idea :-
    *      -> create distance array with infinites(int max values ) .
    *      -> For a count of v-1 times , relax all edges of the graph.
    *
    *               -> RELAX means : if dist[v] > dist[u] + weight(u,v)
    *
    *                                       dist[v] = dist[u] + weight(u,v)
     *
    *       -> this will give us shortest paths from the source to all its edegs
    *
    *
    *          -> You can determine -ve cycle by iterating vth time
    *
    *
    *
    * */


    public static void run(GraphAdjacencyListWithWeights graph , int source){

        int v = graph.getArr().size();

        int[] dist = new int[v];


        Arrays.fill(dist , Integer.MAX_VALUE);

        dist[source] = 0;

        System.out.println("Initially distance array : " + Arrays.toString(dist));

        for(int count = 0; count < v-1 ; count++){
            relaxForEachEdge(graph , dist , count);
        }

        if(isNegativeCycleExists(graph , dist)){
            System.out.println("There exists a -ve cycle");
        }else{
            System.out.println(Arrays.toString(dist));
        }



    }

    public static void relaxForEachEdge(GraphAdjacencyListWithWeights graph , int[] dist,int  count){
        int n = graph.getArr().size();
        for(int i=0 ; i< n ; i++){
            for(GraphAdjacencyListWithWeights.Edge edge : graph.getArr().get(i)){
                int u = i;
                int v = edge.vertex;
//              this below operation is called relaxing
                if( dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + edge.weight){
                    dist[v] = dist[u] + edge.weight;
                }
            }
        }

        System.out.println("Distance array after "  + count + "st iteration : " + Arrays.toString(dist));
    }

    public static boolean isNegativeCycleExists(GraphAdjacencyListWithWeights graph , int[] dist){
        int n = graph.getArr().size();
        for(int i=0 ; i< n ; i++){
            for(GraphAdjacencyListWithWeights.Edge edge : graph.getArr().get(i)){
                int u = i;
                int v = edge.vertex;
//              this below operation is called relaxing
                if( dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + edge.weight){
                   return true;
                }
            }
        }

        return  false;
    }
}
