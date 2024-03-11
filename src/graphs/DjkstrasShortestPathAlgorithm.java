package graphs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DjkstrasShortestPathAlgorithm {


    /*
    *
    * Idea :-
    *
    *       We keep a dist array from the source to every other vertex as infinite
    *
    *       -> now keep the distance of the source vertext be 0 and you undertsnad right , from sourvce to source sitance is 0
    *
    *       -> we iterate distance array and for each vertex and also we dont consider finalised vertexes
    *
    *                    -> from the non finalized vertexes we pick the smallest distance one.
    *
    *                   -> we check its adjacent vertexes  and if its curr distance is greater than the distance we reach it throught the vertex
    *
    *                               then update the adjacent vertex distance
    *
    *                       ex:-
    *                               if(dist[u] > dist[v] + weight(v,u)
    *
    *                               then dist[u] = dist[v] + weight(v,u)
    *
    *
    *
    *
    * -> we pick each vertex one by once begining from source , we pick min distance vertex and relax its adjacents
    *
    *               -> relax means :-
    *
    *                                 -> we check its adjacent vertexes  and if its curr distance is greater than the distance we reach it throught the vertex
     *
     *                               then update the adjacent vertex distance
     *
     *                       ex:-
     *                               if(dist[u] > dist[v] + weight(v,u)
     *
     *                               then dist[u] = dist[v] + weight(v,u)
     *
     *
     *
     * Facts:-
     *
     *          -> Dijikstra does not work for negative weights
     *          -> Does the apth change if add a weight to all edges :- yes it will change becoz in apath there can be more nodes
     *
    *
    *
    *
    *
    * */


    public static class Dist {
        public int vertex;
        public int dist;

        public Dist(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }

        @Override
        public String toString() {
            return "Dist{" +
                    "vertex=" + vertex +
                    ", dist=" + dist +
                    '}';
        }
    }



//    Try to implement using adj matrix also
    public static void run(GraphAdjacencyListWithWeights graph){

        djs(graph , 0);
    }


    /*
    *
    * Note : even though in priority queue , we have duplicate records of vertexes , it wont be a problem , becoz we will only consider least distance ,
    *
    *           -> instead of update the object in priotiy queue , we willl insert new record
    *
    *
    * */

    public static void djs(GraphAdjacencyListWithWeights graph , int source){
        int v = graph.getArr().size();

        int[] dist = new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<Dist> pq = new PriorityQueue<>(v , (a,b) -> a.dist - b.dist);

        dist[source] = 0;

        pq.add(new Dist(source , dist[source]));

        while(!pq.isEmpty()){
            Dist d = pq.poll();

            for( GraphAdjacencyListWithWeights.Edge edge : graph.getArr().get(d.vertex)){

                   if(dist[edge.vertex] > dist[d.vertex] + edge.weight){
                       dist[edge.vertex] = dist[d.vertex] + edge.weight;
                       pq.add(new Dist(edge.vertex , dist[edge.vertex]));
                   }
                }


        }

        System.out.println(Arrays.toString(dist));


    }
}
