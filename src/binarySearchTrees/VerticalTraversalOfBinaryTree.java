package binarySearchTrees;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


/*
*
* Idea : use a treemap which has key as the distance and stores all the nodes in that vertical line
*
*
* //To print in the same order use BFS
*
*
*   -> with this you can print topview and bottomview of a binary tree
*
* */


public class VerticalTraversalOfBinaryTree {

    public static void run(Node root){
        TreeMap<Integer , ArrayList<Integer>> map = new TreeMap<>();

        verticalTraversal(root , 0 , map);

        for(Map.Entry<Integer , ArrayList<Integer>> e : map.entrySet()){
            System.out.println(e.getKey() + " : "+ e.getValue().toString());

        }




    }

    public static  void verticalTraversal(Node root ,int dist ,     TreeMap<Integer , ArrayList<Integer>> map){

        if(root == null){
            return;
        }

        if(map.containsKey(dist)){
            map.get(dist).add(root.data);
        }else{
            ArrayList<Integer> arr = new ArrayList<>();

            arr.add(root.data);
            map.put(dist , arr);
        }

        verticalTraversal(root.left , dist - 1 , map);
        verticalTraversal(root.right , dist + 1 , map);

    }
}
