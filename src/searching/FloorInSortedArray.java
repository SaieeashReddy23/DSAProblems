package searching;

public class FloorInSortedArray {

    public static void run(int[] arr , int x){
        int val = flooe(arr , x);
        System.out.println(val);
    }

    public static int flooe(int[] arr, int x){

        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while(l <=r ){
            int mid = l + (r-l)/2;

            if(arr[mid] == x){
                return mid;
            }else if (arr[mid] > x){
                r = mid - 1;
            }else{
                l = mid + 1;
                ans = mid;
            }
        }

        return ans;

    }

}
