package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class KosaRajuAlgorithm {

    /*
    *
    * Helps to find out strongly connnected components
    *
    *   -> Strongly connected means , as set of nodes that can be reached any of the nodes in that set.
    *
    *  Note :-
    *
    *       -> IN undirected ones you can get strongly connected components either through bfs or dfs .
    *
    *           -> but in directed graphs  edge(u , v) doesnot means edge(v,u)
    *
    *
    *
    * Idea :-
    *
    *       -> If you do DFS in correct order of vertices then you can print strongly connected components
    *
    *       -> Sink COmponent :-
    *                   -> component from which we cant reach other components
    *
    *
    *       -> There fore , if you traverse from sink components to source components then you can print strongly connected components
    *
    *
    * Sol :-
    *
    *       -> To get this order there are many algorithms but here we are using kosaraju's algorithm.
    *
    *
    *   kosaraju's algoritm :-
    *
    *           1. order the vertices in decreasing order of their finish times in dfs .
    *
    *                       -> finish times means , all the adjacent vertices are reaches in dfs then that vertex is called finished.
    *
    *                       -> You can do topological sort , which will give the vertices in decreasing order of their finish times.
    *
    *           2. Reverse all the edges.
    *
    *           2. do DFS in the order of vertices obtained from step 1. it will print all the strongly connected vertices of that component
    *
    * */

    public static void run(GraphAdjacencyList graph){
        stronglyConnectedComponents(graph);
    }

    public static void stronglyConnectedComponents(GraphAdjacencyList graph){

//        Step 1 : topological sort

        ArrayList<Integer>  topo = topologicalSort(graph);

        System.out.println("step 1 :- toppo sort values are");

        System.out.println(topo.toString());

//        step 2 : reverse edges

        GraphAdjacencyList reversedEdgesGraph = reverseEdges(graph);

//        step 3 : dfs


        System.out.println("The strongly connected components are : ");


        boolean[] visited = new boolean[topo.size()];

        for(Integer i : topo){
            if(!visited[i]){
                recDfs(reversedEdgesGraph , i , visited);
                System.out.println();
            }
        }

    }

    public static ArrayList<Integer> topologicalSort(GraphAdjacencyList graph){
        ArrayList<Integer> topo = new ArrayList<>();
        int v = graph.getArr().size();
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[v];
        for(int i=0; i< v ; i++){
            if(!visited[i]){
                recDfs(graph , i , visited , st);
            }
        }
        while (!st.isEmpty()){
            topo.add(st.pop());
        }
        return topo;
    }

    public static void recDfs(GraphAdjacencyList graph , int source , boolean[] visited , Stack<Integer> st){
        visited[source] = true;

        for(Integer vertex : graph.getArr().get(source)){
            if(!visited[vertex]){
                recDfs(graph , vertex , visited , st);
            }
        }

        st.push(source);
    }

    public static void recDfs(GraphAdjacencyList graph , int source , boolean[] visited ){
        visited[source] = true;

        System.out.print(source + " , ");

        for(Integer vertex : graph.getArr().get(source)){
            if(!visited[vertex]){
                recDfs(graph , vertex , visited );
            }
        }

    }


    public static GraphAdjacencyList reverseEdges(GraphAdjacencyList graph){
        int v = graph.getArr().size();
        GraphAdjacencyList reverse = new GraphAdjacencyList(v);

        for(int i=0; i < v ; i++){
            for(Integer edge : graph.getArr().get(i)){
                reverse.add(edge , i);
            }
        }

        return reverse;
    }



}
