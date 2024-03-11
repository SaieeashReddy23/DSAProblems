package graphs;

import java.util.PriorityQueue;

public class MinimumSpanningTree {

    /*
    *
    *
    * -> Imagine 4 computers connected with different length wires
    *
    *  -> The minimum amount of wire length to connect all computers is called  minimum spanning tree
    *
    *
    *
    * -> Minimum spanning tree is for weighted and undirected graph
    *
    *
    * -> If you have v vertices , then v-1 edges willl be there in minimum  spanning tree ,
    *
    *    no cycles
    *
    *
    *
    *
    *   ALgorithms to use :-0
    *
    *           -> Prims algorithm :-
    *
    *                       -> maintain two sets , one set is mst and other not mst
    *                       -> using a gready approach take minimum weight of all the vertcies connected to mst and add vertex to mst set.
    *
    *
    * Idea to code :-
    *
    *       -> use adj list
    *       -> use priority queue to get min of weight
    *       -> use boolean array to track is visited or not
    *       -> add source edges into priority queue and till queue is empty poll .
    *       -> for min edge the adjacent are not vivisted add them to priority queue.
    *
    * */

    public static void run(GraphAdjacencyListWithWeights graph){

        System.out.println( "minimum spanning tree of graph is :  " + mst(graph,0));
    }

    public static int mst(GraphAdjacencyListWithWeights graph,int source){
        int v = graph.getArr().size();
        boolean[] visited = new boolean[v];
        PriorityQueue<GraphAdjacencyListWithWeights.Edge> pq = new PriorityQueue<>(v , (a,b) -> a.weight - b.weight);

        visited[source] = true;

        pq.addAll(graph.getArr().get(source));

        int minimumSpanningTree = 0;

        while(!pq.isEmpty()){
            GraphAdjacencyListWithWeights.Edge edge = pq.poll();

            if(!visited[edge.vertex]){
                minimumSpanningTree += edge.weight;
                visited[edge.vertex] = true;

                for(GraphAdjacencyListWithWeights.Edge edge1 : graph.getArr().get(edge.vertex)){
                    if(!visited[edge1.vertex]){
                        pq.add(edge1);
                    }
                }
            }



          }

        return minimumSpanningTree;
    }
}
