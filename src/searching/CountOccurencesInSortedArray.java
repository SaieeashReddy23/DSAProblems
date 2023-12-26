package searching;

public class CountOccurencesInSortedArray {

    public static void run(int[] arr , int x){

        int firstOcc = IndexOfFirstOccurenceInSorted.binarySearch(arr , x);

        if(firstOcc == -1){
            System.out.println("0 Occurences");
            return;
        }

        int lastOcc = IndexOfLastOccurenceInSorted.binarySearch(arr , x);

        int count = lastOcc - firstOcc + 1;

        System.out.println(count + " these many occurences");
    }

}
