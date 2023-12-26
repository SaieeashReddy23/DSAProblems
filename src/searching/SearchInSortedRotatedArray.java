package searching;

import java.util.Arrays;

public class SearchInSortedRotatedArray {

    public static void run(int[] arr , int x){
        System.out.println(Arrays.toString(arr));
        for(int i=0 ; i < arr.length;i++){
//            System.out.println(i);
            int val = search(arr, arr[i]);
//            System.out.println(val);
            System.out.println(String.format("Pos of %d is %d",arr[i], val));
        }
    }

    public static int search(int[] arr , int x ){

        int l = 0;
        int r = arr.length-1;

        while(l <=r){
            int mid = l + (r-l)/2;

//            System.out.println("Left : " + l );
//            System.out.println("Right : " + r );
//            System.out.println("Mid : " + mid );
            if(arr[mid] == x) {
                return mid;
            }
//           check if Left half sorted
            else if (arr[mid] > arr[l] ){
//                checks if it is in range or not
                if(x >= arr[l] && x < arr[mid]){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }else{ // check if right half sorted
                //                checks if it is in range or not
                if(x > arr[mid] && x <= arr[r]){
                    l = mid + 1;

                }else{
                    r = mid - 1;
                }

            }
        }

        return -1;
    }
}
