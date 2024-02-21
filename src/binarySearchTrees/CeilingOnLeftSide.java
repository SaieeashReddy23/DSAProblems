package binarySearchTrees;

import java.util.TreeSet;

public class CeilingOnLeftSide {


    /*
    *
    * Element is >= current element
    *
    *
    *
    *
    * */







    public static void run(int[] arr){

        effMethod(arr);

    }

    public static void naiveMethod(int[] arr){

        for(int i=0; i < arr.length; i++){
            int diff = Integer.MAX_VALUE;
            for(int j=0; j < i; j++){
                if(arr[j] >= arr[i]){
                    diff = Math.min(diff , arr[j] - arr[i]);
                }
            }

            if(diff == Integer.MAX_VALUE){
                System.out.print("-1" + " , ");
            }else{
                int val = arr[i] + diff;
                System.out.print(val + " , ");
            }
        }

    }

//    using BST , in java we can use TreeSet

    public static void effMethod(int[] arr){

        TreeSet<Integer> treeSet = new TreeSet<>();



        for(int i=0; i < arr.length; i++) {

            Integer val = treeSet.ceiling(arr[i]);

            if(val == null){
                System.out.print("-1" + " , ");
            }else{
                System.out.print(val + " , ");
            }

            treeSet.add(arr[i]);
        }


    }
}
