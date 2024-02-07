package trees;

import java.util.HashMap;

public class BinaryTreeFromInorderAndPostOrder {

    private static int postIndex ;


    /*
    * idea is : similar to preorder and inOrder we do this also , but the
    *
    *       Differecnes aare :-
    *
    *               -> PostIndex starts from the right end of postOrder and decrements
    *
    *               -> and also we recursively do righttree first instead fo left tree
    *
    * */

    public static void run(int[] inOrder , int[] postOrder){


        postIndex = postOrder.length - 1;

        HashMap<Integer , Integer> hashMap = new HashMap<>();

        for(int i=0; i< inOrder.length; i++){
            hashMap.put(inOrder[i],i);
        }

        Node root = tree(hashMap , postOrder , 0 , postOrder.length-1);


        print(root);
    }


    public static Node tree(HashMap<Integer , Integer> map , int[] post , int start , int end){

        if(start > end){
            return null;
        }

        if(postIndex < 0){
            return null;
        }

        Node root = new Node(post[postIndex]);
        postIndex--;

        int indexInOrder = map.get(root.val);
        root.right = tree(map,post,indexInOrder + 1  , end );
        root.left = tree(map,post,start ,indexInOrder - 1 );


        return root;
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

