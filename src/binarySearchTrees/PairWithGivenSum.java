package binarySearchTrees;

import java.util.HashMap;
import java.util.HashSet;

public class PairWithGivenSum {


    /*
    *
    * idea 1 : do inorder traversal , store in an array and the use two pointer approach to find the sum
    *
    * idea 2 : hashtable store the values while traversing and check if pair present or not
    *
    *
    *
    * */

    public static HashSet<Integer> set = new HashSet<>();

    public static void run(Node root , int sum){

        if(isPairPresent(root , sum)){
            System.out.println();
            System.out.println("pair is present");
        }else{
            System.out.println("pair is not present");
        }

    }

    public static boolean isPairPresent(Node root , int sum){

        if(root == null){
            return false;
        }

        if(isPairPresent(root.left , sum)){
           return true;
        }


        if(set.contains(sum-root.data)){
            return true;
        }else{
            set.add(root.data);
            System.out.print(root.data + " , ");
        }




        return  isPairPresent(root.right , sum);


    }


}
