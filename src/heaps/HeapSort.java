package heaps;

public class HeapSort {

    /*
    *
    * -> Heere we are doing selection sort alagorithm , where we swap largst element to the last idex .
    *
    * -> but in heap sort we use heap data structure , using which we replace max element to last . thats it.
    *
    *
    * Idea :-
    *
    *     -> First build max heap data structure
    *
    *      -> swap root with last index and heapify root with reduced size .
    *
    *       -< This way you can sort the array in nlogn time
    *
    *
    * */


    private int[] arr;


    public HeapSort(int[] arr){
        this.arr = arr;
    }

    private int leftChildIndex(int index){
        return 2*index + 1;
    }

    private int rightChildIndex(int index){
        return 2*index + 2;
    }

    private int parentIndex(int index){
        return (index - 1 )/2;
    }

    private void swap(int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }



    public void buildHeap(){
        int n = arr.length;
        for(int i = (n-2)/2 ; i>=0 ; i-- ){
            maxHeapify(i , arr.length);
        }
    }

    public void maxHeapify(int index , int arrSize){

        int leftChild = leftChildIndex(index);
        int rightChild = rightChildIndex(index);

        int longest = index;

        if(leftChild < arrSize && arr[leftChild] > arr[index] ){
            longest = leftChild;
        }

        if(rightChild < arrSize && arr[rightChild] > arr[index]){
            longest = rightChild;
        }

        if(longest != index){
            swap(longest , index);
            maxHeapify(longest , arrSize);
        }

    }

    public void sort(){
        for(int i=arr.length - 1 ; i>0 ; i--){
            swap(i , 0);
            maxHeapify(0 , i-1);
        }
    }


    public void print(){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " , ");
        }

        System.out.println();
    }


}
