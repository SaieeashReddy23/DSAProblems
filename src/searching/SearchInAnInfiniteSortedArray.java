package searching;

import java.util.Arrays;

public class SearchInAnInfiniteSortedArray {

    public static void run(int[] arr , int x){

        if(arr[0] == x){
            System.out.println(0);
            return;
        }

        int pos = 1;

        while(arr[pos] < x){
            pos = pos*2;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("position is " + pos);

        if(arr[pos] == x){
            System.out.println(pos);
        }


        System.out.println(search(arr , pos/2 + 1 , pos - 1 , x));

    }

    public static int search(int[] arr , int l , int h, int x){

        System.out.println("left " + l);
        System.out.println("right " + h);

        while(l <=h){
            int mid = l + (h-l)/2;
            System.out.println("Binary search " + mid);
            System.out.println("left " + l);
            System.out.println("right " + h);

            if(arr[mid] == x){
                return mid;
            }else if (arr[mid] > x){
                h = mid -1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
}
