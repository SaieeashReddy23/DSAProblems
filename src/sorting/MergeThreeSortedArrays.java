package sorting;

import java.util.ArrayList;

public class MergeThreeSortedArrays {

    public static void run(int[] a , int[] b , int[] c){
        ArrayList<Integer> res = new ArrayList<>();

        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;

        int i = 0;
        int j = 0;
        int k = 0;

        // between  a, b , c

        while(i < n1 && j < n2 && k < n3){

            int ai = a[i];
            int bj = b[j];
            int ck = c[k];

            if(ai <= bj && ai <= ck){
                res.add(ai);
                i++;
            }else if (bj <= ai && bj <= ck){
                res.add(bj);
                j++;
            }else {
                res.add(ck);
                k++;
            }
        }


        // between a & b

        while(i < n1 && j < n2){

            if(a[i] <= b[j]){
                res.add(a[i]);
                i++;
            }else{
                res.add(b[j]);
                j++;
            }
        }


        // between b & c

        while(j < n2 && k < n3){

            if(b[j] <= c[k]){
                res.add(b[j]);
                j++;
            }else{
                res.add(c[k]);
                k++;
            }
        }


        // between c & a

        while(i < n1 && k < n3){

            if(a[i] <= c[k]){
                res.add(a[i]);
                i++;
            }else{
                res.add(c[k]);
                k++;
            }
        }



        // a
        while(i < n1){
            res.add(a[i]);
            i++;
        }


        //   b
        while(j < n2){
            res.add(b[j]);
            j++;
        }

        // c
        while(k < n3){
            res.add(c[k]);
            k++;
        }


        System.out.println(res);
    }
}
