package graphs;

public class DetectCycleInDirectedGraph {


    /*
    *
    * Ths solution for undirected graph to determine cycle will not work for this directed graph
    *
    * Idea is :-
    *
    *   -> in dfs , we need to find out if any ancestor  occurs from the child then cycle exists
    *
    *       so we use another array to know in stack if a node is there or not
    *
    * */

    public static void run(GraphAdjacencyList list){

        if(isCycleDetected(list)){
            System.out.println("Cycle is deteced");
        }else{
            System.out.println("Cycle is not detected");
        }
    }

    public static boolean isCycleDetected(GraphAdjacencyList list){
        int v = list.getArr().size();
        boolean[] visited = new boolean[v];
        boolean[] recStac = new boolean[v];

        for(int i=0; i< v; i++){
            if(!visited[i]){
                if(dfs(list , i , visited , recStac)){
                    return true;
                }
            }
        }

        return false;


    }

    public static boolean dfs(GraphAdjacencyList list , int source , boolean[] visited , boolean[] recStac){

        visited[source] = true;

        recStac[source] = true;

        for(Integer i : list.getArr().get(source)){
            if(!visited[i]){
                if(dfs(list , i , visited , recStac)){
                    return true;
                }
            }else if (recStac[i]){
                return true;
            }
        }

        recStac[source] = false;

        return false;

    }
}
