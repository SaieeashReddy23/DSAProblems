package binarySearchTrees;

public class FloorInBST {
        /*
        *
        * Floor :  FInd the node which is Equal to or less than the given value
        *
        * if value found return it
        *
        * if not found , return the greatest value less than that value
        *
        * if no smaller value than the given value return null
        *
        * */


    public static void run(Node root , int x){

        Node fl = floor(root , x);

        if(fl != null){
            System.out.println(fl.data);
        }else{
            System.out.println("it is null");
        }

    }

    public static Node floor(Node root , int x){

        Node res = null;
        while(root != null){
            if(root.data == x){
                return root;
            }

            if(root.data > x){
                root = root.left;
            }else if (root.data < x ){
                res = root;
                root = root.right;
            }

        }

        return res;

    }


}
