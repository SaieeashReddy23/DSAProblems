package binarySearchTrees;

public class CheckBST {

    public static Node prev = null;

    /*
    *
    * Check if a tree is BST or not
    *
    * */

    public static void run(Node root){

        if(!checkBstorNotWithRanges(root , Integer.MIN_VALUE , Integer.MAX_VALUE)){
            System.out.println("its not a BST ");
        }

    }

    public static void checkIfBstorNot(Node root ){

        if(root == null){
            return;
        }

        checkIfBstorNot(root.left);

        if (prev != null) {
            if (prev.data > root.data) {
                System.out.println("it is not a binary tree");
            }
        }

        prev = root;

        checkIfBstorNot(root.right);

    }


//    another solution , using ranges min and max

    public static boolean checkBstorNotWithRanges(Node root , int min , int max ){

        if(root == null){
            return true;
        }

        return (root.data > min && root.data < max) &&  checkBstorNotWithRanges(root.left , min , root.data) && checkBstorNotWithRanges(root.right , root.data , max);

    }

}
