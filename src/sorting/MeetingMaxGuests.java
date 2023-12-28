package sorting;

import java.util.Arrays;

public class MeetingMaxGuests {


//    Idea is sort both array and at each time count how many giuests are there and then get the max of that , similar to merge sort

    public static void run(int[] arr , int[] dep){

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1;
        int j = 0;
        int curr = 1;
        int res = 0;

        while(i < arr.length && j < dep.length){
            if(arr[i] <= dep[j]){
                curr++;
                i++;
            }else{
                curr--;
                j++;
            }
            res = Math.max(res, curr);
        }

        System.out.println(res);

    }
}
