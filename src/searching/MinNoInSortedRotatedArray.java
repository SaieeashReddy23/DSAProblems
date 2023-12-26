package searching;

public class MinNoInSortedRotatedArray {

    public static void run(int[] arr){
        System.out.println(minVal(arr));
    }

    public static int minVal(int[] arr){

        int l = 0;
        int r = arr.length - 1;

        if(arr[l] < arr[r]){
            System.out.println("It is a sorted array");
            return arr[l];
        }

        System.out.println("it is a rotated array");

        while(l <= r){
            int mid = l + (r-l)/2;

            if(arr[mid-1] > arr[mid]  ){
                return mid;
            }

            if(arr[mid] > arr[r]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return -1;
    }

}
