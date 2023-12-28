package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {

    public static class Interval{
        int start;
        int end;

        public  Interval(int start , int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    public static void run(){

        Interval[] arr = new Interval[]{new Interval(5,10),new Interval(3,15),new Interval(18,30),new Interval(2,7)};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start -  o2.start;
            }
        });


        System.out.println(Arrays.toString(arr));

        int res = 0;

        for(int i=1; i< arr.length ; i++){
            if(arr[res].end > arr[i].start){
                int start = Math.min(arr[res].start , arr[i].start);
                int end = Math.max(arr[res].end , arr[i].end);
                arr[res] = new Interval(start,end);

            }else{
                res++;
                arr[res] = arr[i];
            }
        }

        for(int i=0; i<= res ; i++){
            System.out.println(arr[i]);
        }

    }


}
