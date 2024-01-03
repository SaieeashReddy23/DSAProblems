package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoUnsortedArrays {

    public static void run(int[] a , int[] b){

        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< a.length; i++){
            set.add(a[i]);
        }

        for(int i=0; i< b.length;i++){
            if(set.contains(b[i])){
                count++;
                set.remove(b[i]);
            }
        }

        System.out.println("no of common integers bwteen these 2 arrays is " + count);




    }
}
