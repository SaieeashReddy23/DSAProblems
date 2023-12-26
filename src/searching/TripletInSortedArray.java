package searching;

public class TripletInSortedArray {

    public static void run(int[] arr,int sum){

        if(isTripletPresent(arr , sum)){
            System.out.println("Triplet present");
        }else{
            System.out.println("Not present");
        }
    }

    public static boolean isTripletPresent(int[] arr,int sum){

        for(int i=0 ; i< arr.length;i++){
            if(twoPointer(arr , sum - arr[i],i)){
                return true;
            }
        }

        return false;
    }

    public static boolean twoPointer(int[] arr , int sum , int l ){

        int r = arr.length-1;

        while( l < r){
            if(arr[l] + arr[r] == sum){
                return true;
            }
            if(arr[l] + arr[r] > sum){
                r--;
            }else{
                l++;
            }
        }

        return  false;
    }

}
