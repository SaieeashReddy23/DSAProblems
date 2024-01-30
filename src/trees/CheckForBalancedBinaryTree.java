package trees;

public class CheckForBalancedBinaryTree {


    /*
    *
    * A tree is called a balanced tree if its left and right subtree heights difference is not more than one
    *
    * */


    public static void run(Node root){

        int val = method2(root);
        if(val != -1){
            System.out.println("it is balanced");
        }else{
            System.out.println("it is not balanced");
        }
    }


//    Naive sol , but timecompelxity is O(n^2)
    public static boolean method1(Node root){

        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return  false;
        }



        return method1(root.left) && method1(root.right);

    }

    public static int method2(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = method2(root.left);

        if(leftHeight == -1 ){
            return -1;
        }

        int rightHeight = method2(root.right);

        if( rightHeight == -1 || Math.abs(leftHeight-rightHeight) > 1){
            return -1;
        }



        return Math.max(leftHeight , rightHeight) + 1;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight , rightHeight) + 1;
    }
}
