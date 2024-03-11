package graphs;

import java.util.ArrayList;

public class LevelOfNodes {

    public static void run(GraphAdjacencyList graph   , int x){

        System.out.println("Level of " + x + " is " + levelOfNode(graph, x));
    }

    public static int levelOfNode( GraphAdjacencyList graph ,int x){
        int v = graph.getArr().size();
        boolean[] visited = new boolean[v];

        return levelX(graph, 0 , visited , x , 0);
    }

    public static int levelX(GraphAdjacencyList graph, int source , boolean[] visited , int x, int level){

        visited[source] = true;

        if(source == x){
            return level;
        }

        int resLevel = -1;


        for(Integer val : graph.getArr().get(source)){
            if(!visited[val] && resLevel == -1){
                resLevel = levelX(graph , val , visited , x , level+1);
            }
        }


        return resLevel;



    }

}
