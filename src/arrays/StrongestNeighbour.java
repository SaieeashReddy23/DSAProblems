package arrays;

public class StrongestNeighbour {

    public static void run(int[] arr){
        for(int i=0 ; i < arr.length-1 ; i++){
            System.out.println(Math.max(arr[i], arr[i+1]));
        }
    }

}
