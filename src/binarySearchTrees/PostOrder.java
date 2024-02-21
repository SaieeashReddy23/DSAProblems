package binarySearchTrees;

import java.util.Arrays;
import java.util.HashMap;

public class PostOrder {
/*
*
* Create a postorder from a PreOrer BST array
*
*
* idea : by sorting you will get inOrder
*
*       -> using both inorder and preOrer form an BST
*
*       -> from there get a PostOrder
*
* */

    private static int preIndex = 0;


    public static void run(int[] pre ){

        int[] inOrer =  Arrays.copyOf(pre , pre.length);

        Arrays.sort(inOrer);


        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0; i< inOrer.length; i++){
            map.put(inOrer[i],i);
        }

        Node root = formBst(map , pre , 0 , pre.length-1);

        postOrderTraversal(root);


    }

    public static  Node formBst(HashMap<Integer , Integer> map , int[] pre , int start , int end){

        if(start > end){
            return null;
        }

        Node root = new Node(pre[preIndex]);

        preIndex++;
        int newIndex = map.get(root.data);

        root.left = formBst(map,pre,start , newIndex - 1);
        root.right = formBst(map,pre,newIndex + 1 , end);

        return root;
    }


    public static void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " , ");

    }
}
