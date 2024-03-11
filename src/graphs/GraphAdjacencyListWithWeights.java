package graphs;

import java.util.ArrayList;

public class GraphAdjacencyListWithWeights {

    public class Edge{
        int vertex;
        int weight;

        public Edge(int vertex , int weight){
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "vertex=" + vertex +
                    ", weight=" + weight +
                    '}';
        }
    }

    private ArrayList<ArrayList<Edge>> arr ;


    public GraphAdjacencyListWithWeights(int v){
        arr = new ArrayList<>();

        for(int i=0; i< v; i++){
            arr.add(new ArrayList<>());
        }
    }

    public ArrayList<ArrayList<Edge>> getArr() {
        return arr;
    }

    public void add(int u , int v,int weight){
        arr.get(u).add(new Edge(v ,weight));

        /*
         *
         *
         * Below will be commented for directed graphs
         *
         * for undirected graphs below will be uncommented
         *
         * */


//        arr.get(v).add(new Edge(u , weight));
    }


    public void print(){
        for (ArrayList<Edge> temp : arr) {
            for (Edge edge : temp) {
                System.out.print(edge.toString() + " , ");
            }
            System.out.println();
        }
    }

}
