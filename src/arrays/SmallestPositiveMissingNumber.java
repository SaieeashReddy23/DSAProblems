package arrays;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {

    /*
    *
    * Here we will be using a concept to track the presence of elements
    *
    * a[i] - 1 %n -  where index values are updated , read more about it becoz you dont have clarity
    *
    * */
    public static void run(int[] arr){
        int val = smallestPositive(arr);
        System.out.println(val);
    }

    public static int smallestPositive(int[] arr){
        //        Find 1 if it not present then result is 1
        boolean isOnePresent = false;

        for(int i=0; i < arr.length ; i++){
            if(arr[i] == 1){
                isOnePresent = true;
                break;
            }
        }

        if(!isOnePresent){
            return 1;
        }

//        track array numbers with their indices , but it will only work for positive numbers

        System.out.println("Original Array " + Arrays.toString(arr));


        for(int i=0 ; i< arr.length; i++){
            if(arr[i] <=0 || arr[i] > arr.length){
                arr[i] = 1;
            }
        }


        System.out.println("Array after removing out of range of 1 to n " + Arrays.toString(arr));


//        Tracker number using their indexes

        for(int i=0; i < arr.length ; i++){
            arr[(arr[i] - 1 )%arr.length] += arr.length;
            System.out.println("Array after tracking  for iteration : " + i + " " + Arrays.toString(arr));
        }

        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] <= arr.length){
                return i+1;
            }
        }


//if array has values from 1 to n then smallest postive number is
        return arr.length+1;


    }
}
