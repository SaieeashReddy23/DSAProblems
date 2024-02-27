package heaps;

import java.util.Arrays;
import java.util.Map;

public class BinaryHeapImplementation {


    /*
    *
    *   Functions we wrote for heap :-
    *
    *               -> leftchild , rightChild , parent -  to get indexs
    *
    *               -> swap - with indexes
    *
    *               -> heap insert - insert at last then check with parent till parent is < this element , if not swap
    *
    *               -> heapify - if a value if not following heap properties , we try to heapify its left and right subtree
    *
    *                           -> find min of left , right and that index , if min != index then swap with this left or right
    *
    *               -> extact - min - replace root with last index and the heapify
    *
    *               -> decrease - key - value of a index is decreased - now compare with parent and swap if that is < parent
    *
    *               -> delete  - place last element at its index and then do heapify down
    *
    *               -> buildHeap -  normal array to heap , from last element parent onwards - do heapify down , which will make whole heap
    *
    *
    *
    *
    * */


    private int[] arr;
    private int size;
    private int capacity;


    public BinaryHeapImplementation(int cap){
        this.arr = new int[cap];
        this.capacity = cap;
        this.size = 0;
    }

    public BinaryHeapImplementation(int[] arr , int cap){
        this.arr = new int[cap];
        for(int i=0; i< arr.length ; i++){
            this.arr[i] = arr[i];
        }
        this.capacity = cap;
        this.size = arr.length;
    }

    public int leftChild(int index){
        return (2*index + 1);
    }

    public int rightChild(int index){
        return (2*index + 2);
    }

    public int parent(int index){
        return (index - 1) / 2 ;
    }


    /*
    *
    * it is needs to follow 2 conditions , tree(though stored in a array) should be complete and is less than its descendents
    *
    * Idea :-
    *
    *       -> first place the number at the last
    *       -> now compare with its parent and if it is less than parent then swap with parent
    *       -> do this until parent less than new number or you reach root
    *
    *
    * */

    public void heapInsert(int number ){

        if(size == capacity){
            System.out.println("Heap reached its maximum capacity , so cant do anything");
        }

        arr[size] = number;
        size++;

        int newNumberIndex = size-1;


        int parentIndex = parent(newNumberIndex);

        while (newNumberIndex > 0 && arr[newNumberIndex] < arr[parentIndex]) {
            swap(newNumberIndex , parentIndex);
            newNumberIndex = parentIndex;
            parentIndex = parent(newNumberIndex);
        }
    }

    private void swap(int newIndex , int parentIndex){
        int temp = arr[newIndex];
        arr[newIndex] = arr[parentIndex];
        arr[parentIndex] = temp;
    }




    /*
    *
    * Problem statement for this is , in our heap one element may or maynot be violating the heap rules
    *
    *           -> you have to fix it using heapify function
    *
    *
    *
    * */


    public void heapify(int someIndex){

        int leftIndex = leftChild(someIndex);
        int rightIndex = rightChild(someIndex);

        int smallest = someIndex;

        if(leftIndex < size && arr[leftIndex] < arr[smallest]){
            smallest = leftIndex;
        }

        if(rightIndex < size && arr[rightIndex] < arr[smallest]){
            smallest = rightIndex;
        }

        if(smallest != someIndex){
            swap(someIndex , smallest);
            heapify(smallest);
        }


    }


//    0th index will always be the smallest element
    public int getMin(){
        return arr[0];
    }




    /*
    *
    * You need to return the min elemenet and also remove it from the heap
    *
    * Idea :-
    *
    *   -> replace root with last element and then do heapify for root
    *
    * */


    public int extractMin(){

        if(size == 0){
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            size--;
            return  arr[0];
        }

        int min = arr[0];

        swap(0 , size-1);

        arr[size-1] = 0;
        size--;

        heapify(0);

        return min;

    }


    /*
    *
    * with this function you are like decreasing the value of an index
    *
    *   -> With this heap will break its rules
    *
    * Idea to fix it :-
    *
    *       -> insert that new value at index and then compare with parent if it is greater then stop else swap
    *
    *       -> repeat this process till root
    *
    * */

    public void decreaseKey(int index , int value){

        if(index >= size){
            System.out.println("Pls give correct index");
        }

        arr[index] = value;
        while(index !=0 && arr[parent(index)] > arr[index]){
            int parentIndex = parent(index);
            swap(index , parentIndex);

            index = parentIndex;
        }
    }


    /*
    *
    * idea : replace that with last element and then heapify
    * */

    public void delete(int index){

        swap(index , size-1);

        size--;

        heapify(index);

    }



    /*
    *
    * get the bottom most , right most internal node , means , parent of the lastelement
    *
    * idea :-
    *
    *   from the parent of the last node start doing heapify for each index till root , this will make the array a heap structure
    *
    * */
    public void buildHeap(){

        for(int i=((size-2)/2) ; i>=0 ; i--){
            heapify(i);
        }
    }




    public void print(){
        for(int i=0; i< size; i++){
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }

}
