package trees;

public class IsFoldable {


    /*
    *
    * Idea :- change left subtree  to its mirror and check if structure of left and right subtree same or not
    *
    * */

    public static void run(Node root){


        if(isFoldable(root)){
            System.out.println("it is foldable");
        }else{
            System.out.println("It is not foldable");
        }
    }

    public static boolean isFoldable(Node root ){

        if(root == null){
            return true;
        }

        mirror(root.left);

        return isStructureSame(root.left , root.right);
    }

    public static void mirror(Node root){
        if(root == null){
            return;
        }

        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left  = root.right;
        root.right = temp;
    }


    public static boolean isStructureSame(Node lefttree , Node righttree){

        if(lefttree == null && righttree == null){
            return true;
        }

        if(lefttree != null  && righttree != null){
            return  isStructureSame(lefttree.left , righttree.left) && isStructureSame(righttree.right , righttree.right);
        }

        return false;

    }



}
