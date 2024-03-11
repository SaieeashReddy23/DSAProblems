package graphs;

public class DepthFirstSearch {

    /*
    *
    * Idea :-
    *       We call recursively for each vertex for its adjacents vertextes
    *
    *
    * Time complexity : O(V+E)
    *
    *
    * */



//    All nodes are connected
    public static void run(GraphAdjacencyList list){

        boolean[] visited = new boolean[list.getArr().size()];

        dfs(list,0,visited);

    }

    public static void dfs(GraphAdjacencyList list , int source , boolean[] visited){

        visited[source] = true;

        System.out.print(source + " , ");

        for(Integer i : list.getArr().get(source)){
            if(!visited[i]){
                dfs(list,i , visited);
            }

        }
    }


    /*
    *
    * All nodes are not connected*/
    public static void scenario2(GraphAdjacencyList list){
        boolean[] visited = new boolean[list.getArr().size()];

        for(int i=0; i< visited.length; i++){
            if(!visited[i]){
                dfs(list,i,visited);
            }
        }

    }

    /*
     *
     * All nodes are not connected ,
     *
     * Count islands
     *
     *
     *
     *
     * */
    public static void scenario3(GraphAdjacencyList list){
        boolean[] visited = new boolean[list.getArr().size()];

        int count = 0;
        for(int i=0; i< visited.length; i++){
            if(!visited[i]){
                count++;
                dfs(list,i,visited);
            }
        }

        System.out.println();
        System.out.println("No of islands : " + count);

    }

}
