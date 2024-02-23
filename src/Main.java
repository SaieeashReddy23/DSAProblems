import binarySearchTrees.*;
import heaps.BinaryHeapImplementation;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10,5,20,2,4,8 };

        BinaryHeapImplementation heap = new BinaryHeapImplementation(arr ,  20);

        heap.buildHeap();

        heap.print();



    }


}