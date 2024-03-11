package graphs;

import java.util.ArrayList;

public class GraphAdjacencyList {
    private ArrayList<ArrayList<Integer>> arr ;


    public GraphAdjacencyList(int v){
        arr = new ArrayList<>();

        for(int i=0; i< v; i++){
            arr.add(new ArrayList<>());
        }
    }

    public ArrayList<ArrayList<Integer>> getArr() {
        return arr;
    }

    public void add(int u , int v){
        arr.get(u).add(v);

        /*
        *
        *
        * Below will be commented for directed graphs
        *
        * for undirected graphs below will be uncommented
        *
        * */


//        arr.get(v).add(u);
    }


    public void print(){
        for(int i=0; i< arr.size(); i++){
            ArrayList<Integer> temp = arr.get(i);

            for(int j=0; j < temp.size();j++){
                System.out.print(arr.get(i).get(j) + " , ");
            }

            System.out.println();
        }
    }

}
