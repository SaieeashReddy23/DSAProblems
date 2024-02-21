package binarySearchTrees;

public class CeilInBST {

    public static void run(Node root , int x){

        Node ceil = ceil(root , x);

        if(ceil == null){
            System.out.println("Not found , it is null");
        }else{
            System.out.println(ceil.data);
        }
    }

    public static Node ceil(Node root , int x){

        Node res = null;

        while(root != null){
            if(root.data == x){
                return root;
            }
            if(root.data > x){
                res = root;
                root = root.left;
            }else if (root.data < x){
                root = root.right;
            }
        }

        return res;


    }

}
