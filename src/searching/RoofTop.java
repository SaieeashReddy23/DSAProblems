package searching;

public class RoofTop {

    /*
    * You are given heights of consecutive buildings. You can move from the roof of a building to the roof of
    *  next adjacent building. You need to find the maximum number of consecutive steps you can put forward
    *  such that you gain an increase in altitude with each step.
    *
    * */
    public static void run(int[] arr){

        int res = 0;

        int count = 0;

        for(int i=0 ; i < arr.length-1 ; i++){
            if(arr[i] < arr[i+1]){
                count++;
            }else{
                res = Math.max(res , count);
                count = 0;
            }
        }

        res = Math.max(res,count);

        System.out.println(res);
    }

}
