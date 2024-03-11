package graphs;

public class PossiblePathBetweenVertices {

    /*
    *
    * Given a Directed Graph having V nodes numbered from 0 to V-1, and E directed edges.
    *  Given two nodes, source and destination, count the number of ways or paths between
    * these two vertices in the directed graph. These paths should not contain any cycle.
    *  Note: Graph doesn't contain multiple edges, self-loop, and cycles.
    *
    *
    * */

    public static int paths = 0;

    public static void run(GraphAdjacencyList graph , int source , int destination){

        System.out.println("Possible no of paths is : " + possibleNoOfPaths(graph , source , destination));
    }

    public static int possibleNoOfPaths(GraphAdjacencyList graph , int source , int destination){
        int v = graph.getArr().size();
        boolean[] visited = new boolean[v];

        dfs(graph , source , destination , visited);

        return  paths;

    }


    public static void dfs(GraphAdjacencyList graph , int source , int destination,boolean[] visited){
        visited[source] = true;

        if(source == destination){
            paths++;
        }

        for(Integer val : graph.getArr().get(source)){
                dfs(graph , val , destination , visited);
        }
    }

}
