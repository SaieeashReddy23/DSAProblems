package binarySearchTrees;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindCommonNodesInBST {

    public static void run(Node root1 , Node root2){


        TreeSet<Integer> set1 = new TreeSet<>();

        ArrayList<Integer> res = new ArrayList<>();


        insertSetValues(root1, set1);

        commonElements(root2, res , set1);


        System.out.println(res.toString());



    }

    public static void commonElements(Node root , ArrayList<Integer> arr , TreeSet<Integer> set){

        if(root == null){
            return;
        }

        commonElements(root.left , arr , set);

        if(set.contains(root.data)){
            arr.add(root.data);
        }

        commonElements(root.right , arr, set);

    }

    public static void insertSetValues(Node root ,TreeSet<Integer> set ){

        if(root == null){
            return;
        }

        set.add(root.data);

        insertSetValues(root.left , set);
        insertSetValues(root.right , set);

    }
}
