package sorting;

import java.util.Collections;
import java.util.List;

public class SortByAbsDiff {

    public static void run(List<Integer> arr,int k){

        System.out.println(arr);

        Collections.sort(arr , (x,y) -> Math.abs(x-k) - Math.abs(y-k));

        System.out.println(arr);
    }
}
