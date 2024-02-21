package binarySearchTrees;

public class DeletionInBST {


    /*
    *
    *
    * Idea :
    *
    *       when you find the element , if leaf remove it
    *
    *           -> if having one child , return the other one
    *
    *           -> if two children , then closest greater element or closest smalleer element
    *
    *
    * */

    public static void run(Node root , int x){

        print(root);

        Node newRoot = delete(root , x);

        System.out.println();

        print(newRoot);
    }


    public static Node delete(Node root , int x){

        if(root == null){
            return null;
        }

        if(root.data == x){

            if(root.left == null && root.right == null){
                return null;
            }else if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }else {

//                return closest greater or closest smaller element , her considerig closest greater

                Node closest = smallestElementInSubTree(root.right);

                root.data = closest.data;

                root.right = delete(root.right, closest.data);

                return root;

            }

        }

        if(root.data > x){
            root.left = delete(root.left , x);
        }else if (root.data < x){
            root.right = delete(root.right , x);
        }

        return root;
    }


    public static Node smallestElementInSubTree(Node root){

        Node curr = root;

        while(curr != null && curr.left != null){
            curr = curr.left;
        }

        return curr;


    }


    public static void print(Node root ){
        if(root == null){
            return;
        }

        print(root.left);

        System.out.print(root.data + " , ");

        print(root.right);
    }

}
