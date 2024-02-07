package trees;

import java.util.HashMap;

public class BinaryTreeFromInOrderAndPreOrder {

    private static int preIndex = 0;


    /*
    * Note :- we can construct a binary tree only when one inorder and another traversal is given
    *
    *
    *       if(both post and pre order traversal is given we cant., on should be inorder.
    *
    *
    *
    *   Idea is : element creation can be done using preOrder , inorder used for left and right subtrreee.
    *
    *
    * her time compelxity is O(n^2) -  but we can make it O(n) by using hastable , to store indexws of the values;
    *
    * */


    public static void run(int[] inorder , int[] preOrder  ){


    }


    public static Node method1(int[] inOrder , int[] preorder , int start , int end){

        if(start > end){
            return  null;
        }

        Node root  = new Node(preorder[preIndex]);

        preIndex++;

        int newIndex = 0;

        for(int i= start ; i<=end ; i++){
            if(inOrder[i] == root.val){
                newIndex = i;
            }
        }

        root.left = method1(inOrder , preorder , start , newIndex - 1);
        root.right = method1(inOrder , preorder , newIndex+1 , end);

        return root;


    }


    public static Node method1(int[] inOrder , int[] preorder , int start , int end , HashMap<Integer , Integer> map){

        if(start > end){
            return  null;
        }

        Node root  = new Node(preorder[preIndex]);

        preIndex++;

        int newIndex = map.get(root.val);

        root.left = method1(inOrder , preorder , start , newIndex - 1);
        root.right = method1(inOrder , preorder , newIndex+1 , end);

        return root;


    }


}
