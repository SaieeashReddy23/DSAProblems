package searching;

public class CountOnesInSortedBinaryArray {
    public static void run(int[] arr){
        int first = binary(arr);

        if(first == -1){
            System.out.println("Not found");
            return;
        }

        System.out.println(arr.length - first );


    }


    public static int binary(int[] arr ){

        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid]  < 1){
                low = mid +1;
            }else{
                if(mid == 0 || arr[mid - 1] != 1){
                    return mid;
                }else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }
}
