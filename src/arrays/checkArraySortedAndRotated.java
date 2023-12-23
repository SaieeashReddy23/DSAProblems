package arrays;

public class checkArraySortedAndRotated {

    public static void run(int[] arr){

        if(isSortedAndRotated(arr)){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }


    }

    /*
    *
    * get min and max indexes of the values
    *
    * if maxIndex == minIndex  -1   ==> inreasinfg
    * if minIndex = maxIndex- 1    ===> dexreasing
    *
    * check if it is alreasy sorted and not rotated  then false
    *
    * in that one check if the two parts are increasing or decreasing
    *
    *
    * */

    public static  boolean isSortedAndRotated(int[] arr){

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        int minIndex = 0;
        int maxIndex = 0;

        for(int i=0; i< arr.length; i++){
            if(minValue > arr[i]){
                minValue = arr[i];
                minIndex = i;
            }

            if(maxValue < arr[i]){
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        boolean res = false;


        if(maxIndex == minIndex - 1){
//            Increasing
            res = isIncRotated(arr , maxIndex);
        }


        if(minIndex == maxIndex - 1){
//            Decreasing

            res = isDescRotated(arr , minIndex);
        }

        return res;

    }


    public static boolean isIncRotated(int[] arr , int index){
        if(arr[0] < arr[arr.length-1]){
            return false;
        }

        return isIncreasing(arr ,0 ,  index) && isIncreasing(arr , index+1 , arr.length-1);

    }


    public static boolean isDescRotated(int[] arr , int index){

        if(arr[0] > arr[arr.length-1]){
            return false;
        }

        return isDescresing(arr , 0 ,index ) && isDescresing(arr, index+1 , arr.length-1);
    }


    public static boolean isIncreasing(int[] arr, int min , int max){

        for(int i=min ; i<= max -1 ; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;

    }

    public static boolean isDescresing(int[] arr, int min , int max){

        long[] t = new long[24];

        for(int i=min ; i<= max -1 ; i++){
            if(arr[i] < arr[i+1]){
                return false;
            }
        }
        return true;
    }



}
