package binarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertLevelorderTraversalToBST {

    public static void run(int[] arr){

        Node root = constructBST(arr);
        traversal(root);

    }

    public static Node constructBST(int[] arr){
        if(arr.length == 0){
            return null;
        }

        Node root = null;

        for(int i=0; i< arr.length ; i++){
            root = levelOrder(root , arr[i]);
        }



        return root;
    }

    public static Node levelOrder(Node root , int data){

        if(root == null){
            return new Node(data);
        }

        if(root.data < data){
            root.right = levelOrder(root.right , data);
        }

        if(root.data > data){
            root.left = levelOrder(root.left , data);
        }

        return root;

    }

    public static void traversal(Node root){
        if(root == null){
            return;
        }
        traversal(root.left);
        System.out.print(root.data + " , ");
        traversal(root.right);


    }
}
