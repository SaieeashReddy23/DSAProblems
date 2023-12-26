package searching;

public class MaxWaterBtnTwoBuildings {

    /*
    * Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such
    *  that the water that can be trapped between the remaining two building is maximum.
    * Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.
    *
    *
    * sol : we are using a two pointer approach , we are calculating based on min height building ,
    *  we will move away from min height building and not from max height building becoz it will reduce the qty between smaller
    * and bigger buildings , so move away from smaller building.
    * */


    public static void run(int[] arr){

        int max = 0;
        int i = 0;
        int j = arr.length - 1;

        while( i < j){
            if(arr[i] < arr[j]){
                max = Math.max(max , (j-i-1)*arr[i]);

                i++;

            }else{
                max = Math.max(max , (j-i-1)*arr[j]);
                j--;
            }
        }

        System.out.println(max);
    }
}
