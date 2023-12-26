package searching;

public class SquareRoot {

    public static void run(int x){

        System.out.println(binarySearch(x));

    }

    public static int binarySearch(int x){
        int l = 1;
        int r = x;
        int ans = -1;

        while( l <= r){
            int mid = l + (r-l)/2;

            if(mid*mid > x){
                r = mid-1;
            }else if(mid*mid < x){
                l = mid + 1;
                ans = mid;
            }else{
                return mid;
            }
        }

        return ans;

    }

}
