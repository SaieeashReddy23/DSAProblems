package binarySearchTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeTwoBst {

    public static void run(Node root1 , Node root2){

        ArrayList<Integer> arr = new ArrayList<>();


        fillArr(root1 , arr);
        fillArr(root2 , arr);

        Collections.sort(arr);

        System.out.println(arr.toString());



    }

    public static void fillArr(Node root , ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        fillArr(root.left , arr);

        arr.add(root.data);
        fillArr(root.right , arr);
    }

}
