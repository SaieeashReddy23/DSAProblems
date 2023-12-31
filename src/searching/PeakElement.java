package searching;

public class PeakElement {

    public static void run(int[] arr){
        System.out.println(getPeak(arr));
    }

    public static int getPeak(int[] arr ){
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == arr.length -1 || arr[mid] >= arr[mid+1]) ){
                return mid;
            }

            if ( mid >0 && arr[mid-1] >= arr[mid]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return -1;
    }
}
