package trees;

import java.util.ArrayList;
import java.util.Objects;

public class LCABinaryTree {


    /*
    *
    * It means the common ancestor for two nodes ,
    *
    * Note :- this concept is also used to find the distance between 2 nodes.
    *
    * */


    public static void run(Node root){

            Node lca = method2(root ,40 , 50 );

            if(lca != null){
                System.out.println(lca.val);
            }else{
                System.out.println("Not found");
            }
    }



    /*
    *
    * Naive sol :-
    *
    *          -> Form 2 path arrays for each number
    *          -> the one which is not common in both arrays is your common arrays
    *
    *
    *           -> need to do 3 traversal and need extra space
    *
    *
    *
    * */

    public static Node method1(Node root , int n1 , int n2){

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();


        if(!findPath(root , path1 , n1) || !findPath(root , path2 , n2)){
           return null;
        }

        for(int i=0; i < path1.size() - 1 && i < path2.size() - 1 ; i++ ){
            if(path1.get(i+1).val != path2.get(i+1).val){
                return path1.get(i);
            }
        }

        return null;

    }


    public static boolean findPath(Node root , ArrayList<Node> path , int n){

        if (root == null){
            return false;
        }

        path.add(root);

        if(root.val == n){
            return true;
        }

        if(findPath(root.left , path , n) || findPath(root.right , path , n)){
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }



    /*
    *
    * Eff sol : no need of extra space and also assume those integers present in tree
    *
    *
    *       4 scenarios :-
    *
    *               -> if LCA is either one of n1 or n2
    *
    *               -> if either n1 or n2 is on one subtree and other is on other subtree
    *
    *               -> if both present in one subtree
    *
    *               -> if none is present in a subtree
    *
    * */


    public static Node method2(Node root , int n1 , int n2){

        if(root == null){
            return null;
        }

        if(root.val == n1 || root.val == n2){
            return root;
        }

        Node left = method2(root.left , n1 , n2);
        Node right = method2(root.right , n1 , n2);

        if(left != null && right != null){
            return root;
        }

        if(left != null){
            return left;
        }else{
            return right;
        }

    }


}
