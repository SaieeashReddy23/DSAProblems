import graphs.*;
import heaps.*;

public class Main {
    public static void main(String[] args) {

        GraphAdjacencyList graph = new GraphAdjacencyList(5);

        graph.add(1,0);
        graph.add(0,2);
        graph.add(2,1);
        graph.add(0,3);
        graph.add(3,4);

//
//        graph.add(2,4);
//        graph.add(3,2);

//        graph.add(2,3,6);
//
//        graph.print();
//
//        System.out.println();
//
//        KosaRajuAlgorithm.run(graph );


        int[] kpos = {4,5};
        int[] tar = {1,1};

        StepsByKnight.run(kpos , tar , 6);

    }
}