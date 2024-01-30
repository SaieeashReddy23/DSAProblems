package trees;

public class ChildrenSumProperty {

    /*
    *
    * Children sum property means that the part node value should be equal to sum of left and right child
    *
    * */

    public static void run(Node root){

        if(method1(root)){
            System.out.println("It follows child sum property");
        }else{
            System.out.println("It is not followig child sum property");
        }

    }



    public static boolean method1(Node root){


        if(root == null){
            return true;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        int sum = 0;

        if(root.left != null){
            sum += root.left.val;
        }

        if(root.right != null){
            sum += root.right.val;
        }

        if(sum != root.val){
            return false;
        }


        return method1(root.left) && method1(root.right);


    }

}
