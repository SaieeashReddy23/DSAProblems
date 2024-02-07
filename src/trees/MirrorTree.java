package trees;

public class MirrorTree {

    public static void run(Node root){

        print(root);
        System.out.println();
        Node newRoot = Mirror(root);
        print(newRoot);
        System.out.println();
    }

    public static Node  Mirror(Node root){
        if(root == null){
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

      Mirror(root.left);
     Mirror(root.right);


        return root;

    }


    public static void print(Node root){

        if(root ==null){
            return;
        }

        System.out.print(root.val + " , ");

        print(root.left);
        print(root.right);

    }



}
