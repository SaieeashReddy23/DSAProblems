package binarySearchTrees;

public class FixABSTWithTwoNodesSwapped {

    public static Node prev = null;
    public static Node firstNode = null;
    public static Node secondNode = null;
    public static void run(Node root){

        print(root);
        System.out.println();

        fixBST(root);

        if(firstNode != null && secondNode != null){

            System.out.println("2 nodes need to be swapped");

            int temp = firstNode.data;
            firstNode.data = secondNode.data;
            secondNode.data = temp;
        }

        print(root);


    }

    public static void fixBST(Node root){
        if(root == null){
            return;
        }

        fixBST(root.left);


        if ( prev != null && prev.data > root.data) {
            if(firstNode == null){
                firstNode = prev;
            }
            secondNode = root;
        }


        prev = root;

        fixBST(root.right);
    }


    public static void print(Node root){
        if(root == null){
            return;
        }

        print(root.left);

        System.out.print(root.data + "  , ");

        print(root.right);
    }


}
