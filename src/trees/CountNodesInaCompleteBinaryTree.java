package trees;

public class CountNodesInaCompleteBinaryTree {



    /*
    *
    * If you have heaight of a tree , you can tell ,no of binary nodes nodes =   2^h - 1 if fully filled
    *
    *  -> Compleye binary tree if , except last row all rows are full meaning left and right subtee
    *
    * */

    public static void run(Node root){

        int nodes = method2(root);

        System.out.println(nodes);

    }

    public static int method1(Node root){
        if(root == null){
            return 0;
        }

        return  1 + method1(root.left) + method1(root.right);
    }


    public static int method2(Node root){

        int lh = 0 ;
        int rh = 0;

        if(root == null){
            return 0;
        }


        Node curr = root;

        while(curr.left != null){
            curr = curr.left;
            lh++;
        }

        curr = root;

        while(curr.right != null){
            curr = curr.right;
            rh++;
        }

        if(lh == rh){
            return (int)Math.pow(2 , lh) - 1;
        }

        int leftTreeNodesCOunt = method2(root.left);
        int rightTreeNodesCOunt = method2(root.right);


        return 1 + leftTreeNodesCOunt + rightTreeNodesCOunt;

    }
}
