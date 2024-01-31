package trees;

public class DiameterOfABinaryTree {

//    It means the longest path between 2 leaf nodes


//    idea is : max(1+lh+rh)  gives the diameter


    private static int diameter;


    public static void run(Node root){


        method(root);
        System.out.println(diameter);
    }

    public static int method(Node root){

        if(root == null){
            return 0;
        }

        int lh = method(root.left);
        int rh = method(root.right);

        diameter = Math.max(diameter , 1+lh+rh);

        return Math.max(lh,rh) + 1;


    }


}
