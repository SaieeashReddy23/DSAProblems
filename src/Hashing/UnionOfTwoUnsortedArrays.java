package Hashing;

import java.util.HashSet;

public class UnionOfTwoUnsortedArrays {

    public static void run(int[] a , int[] b){


        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< a.length; i++){
            set.add(a[i]);
        }

        for(int i=0; i< b.length;i++){
            set.add(b[i]);
        }


        System.out.println(set.toString());
    }
}
