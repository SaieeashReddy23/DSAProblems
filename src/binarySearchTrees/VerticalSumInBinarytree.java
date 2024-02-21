package binarySearchTrees;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class VerticalSumInBinarytree {

    public static void run(Node root){
        TreeMap<Integer , Integer> map = new TreeMap<>();

        verticalSUm(root , 0 , map);

        for(Map.Entry<Integer , Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " : "+ e.getValue());
        }


    }

    public static  void verticalSUm(Node root ,int dist ,  TreeMap<Integer , Integer> map){

        if(root == null){
            return;
        }

        map.put(dist  , map.getOrDefault(dist , 0) + root.data);

        verticalSUm(root.left , dist - 1 , map);
        verticalSUm(root.right , dist + 1 , map);

    }
}
