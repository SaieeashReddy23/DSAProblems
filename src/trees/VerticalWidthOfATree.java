package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class VerticalWidthOfATree {

    /*
    *
    * Idea : conside this root and the distance of a node in its left is -1 and right -1 , if distances are same then they are on same vertical line
    *
    * */

    private static TreeMap<Integer , ArrayList<Node>> map = new TreeMap<>();
    public static void run(Node root){

        distanceFromRoot(root , 0);

        for(Map.Entry<Integer,ArrayList<Node>> e : map.entrySet()){
            System.out.print(e.getKey() + " : " +  e.getValue().size());
            System.out.println();
        }

    }


    public static void distanceFromRoot(Node root , int distance){

        if(root == null){
            return;
        }

        ArrayList<Node> list = map.get(distance);

        if(list == null){
            list = new ArrayList<>();
            list.add(root);
        }else{
            list.add(root);
        }

        map.put(distance , list);
        distanceFromRoot(root.left , distance - 1);
        distanceFromRoot(root.right , distance + 1 );

    }
}
