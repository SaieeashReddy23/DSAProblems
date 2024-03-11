package graphs;

import java.util.Arrays;
import java.util.Stack;

public class TarjansAlgorithm {

    private static int time = 0;

    /*
    *
    * it is used to find strongly connected components
    *
    *   Strongly connected component :-
    *
    *           -> every other vertex is reachable from the vertex
    *
    *
    *
    *  -> first learn about discovery time , low(i) , articulation point, bridges
    *
    *
    *
    * Idea :-
    *
    *       IF all the adjacents of a vertex u are done with recursive and disc(u) == low(u) then print
    *
    *       this vertex and all other vertices in the stack
    *
    *
    * Note :- it has no cross edges
    *
    * Sol idea :-
    *
    *       -> intitialize dis[]  and low[] with initial values of -1
    *
    *       -> initialize a stacka and a boolean array telling if elemnt is in stack or not.(quick access)
    *
    *       -> update low values
    *
    *               1. not visite yest =
    *
    *                       low [u] = min(low(u) , low(v))
    *
    *               2 visited and in stack
    *                       low(u) = min(low(u) , disc(v))
    *
    *
    *           -> when low = disc then pop all the elements till current vertex is reached
      * */


    public static void run(GraphAdjacencyList graph){
        tarzansAlgorithm(graph);


    }

    public static void tarzansAlgorithm(GraphAdjacencyList graph){
//        dis , low , stack , track stack members

        int v = graph.getArr().size();

        int[] disc = new int[v];
        int[] low = new int[v];
        boolean[] stackMember = new boolean[v];
        Stack<Integer> st =  new Stack<>();

        Arrays.fill(disc , -1);
        Arrays.fill(low , -1);

        for(int i=0; i< v; i++){
            if(disc[i] == -1){
                scc(graph , i , disc , low , st , stackMember);
            }
        }


    }


    public static void scc(GraphAdjacencyList graph , int u , int[] dist , int[] low , Stack<Integer> st , boolean[] stackMember){

        dist[u] = time;
        low[u] = time;
        time++;
        stackMember[u] = true;
        st.add(u);

        for(Integer v : graph.getArr().get(u) ){
            if(dist[v] == -1){
                scc(graph , v , dist , low , st , stackMember);
                low[u] = Math.min(low[u] , low[v]);
            }else if (stackMember[v]){
                low[u] = Math.min(low[u] , dist[v]);
            }
        }

        int w = -1;
        if(low[u] == dist[u]){
            while(w != u){
                w = st.pop();
                System.out.print(w + " , ");
                stackMember[w] = false;
            }

            System.out.println();
        }
    }
}
