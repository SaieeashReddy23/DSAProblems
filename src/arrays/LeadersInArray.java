package arrays;

public class LeadersInArray {

//    Leaders are the numbers which no element bigger than it on its right side
//    Ex : 5 , 3 , 4 , 0

//        5 , 4 are the leaders


//    Time complexity O(n)
    public static void run(int[] arr){

        boolean[] booleanArray = new boolean[arr.length];

        int max = arr [arr.length-1];
        booleanArray[arr.length-1] = true;

        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i] > max){
                booleanArray[i] = true;
                max = arr[i];
            }
        }

        for(int i=0;i< arr.length ; i++){
            if(booleanArray[i]){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
