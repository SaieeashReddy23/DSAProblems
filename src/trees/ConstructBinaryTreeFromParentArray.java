package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructBinaryTreeFromParentArray {

    public static void run(int[] arr){

//        hashmap of  node value for which child index values
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
               ArrayList<Integer> list =  map.get(arr[i]);
               list.add(i);
                map.put(arr[i],list);
            }else{
                ArrayList<Integer> indexesList = new ArrayList<>();
                indexesList.add(i);
                map.put(arr[i],indexesList);
            }
        }

        Node root = new Node(map.get(-1).get(0));

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0; i< count; i++){
                Node curr = q.poll();

                if(!map.containsKey(curr.val)){
                    continue;
                }
                ArrayList<Integer> arrayList = map.get(curr.val);
                if(arrayList.size() == 2){
                    Node left = new Node(arrayList.get(0));
                    Node right = new Node(arrayList.get(1));
                    curr.left = left;
                    curr.right = right;
                    q.offer(left);
                    q.offer(right);
                }

                if(arrayList.size() == 1){
                    Node left = new Node(arrayList.get(0));
                    curr.left = left;
                    q.offer(left);
                }

            }
        }

        print(root);

    }


    public static void print(Node root){
        if(root == null){
            return;
        }

        print(root.left);
        System.out.print(root.val + "  ");
        print(root.right);
    }
}
