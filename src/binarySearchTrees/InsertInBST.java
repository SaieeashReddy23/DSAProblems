package binarySearchTrees;

public class InsertInBST {


    /*
    *
    *
    * Idea : corner cases , when root is null and also if already present in it
    *
    *       -> if root null then it becomes root
    *
    *       -> if already present dont change anything
    *
    * */


    public static void run(Node root , int k){

        print(root);
        System.out.println();

        Node newRoot = insert(root , k);

        print(newRoot);
    }

    public static Node insert(Node root  ,  int x){

        if(root == null){
            return new Node(x);
        }


        if(root.data > x){
            root.left = insert(root.left , x);
        }else{
            root.right = insert(root.right , x);
        }

        return root;
    }


    public static Node iterativeInsert(Node root , int x){

        Node temp = new Node(x);

        Node parent = null;
        Node curr = root;

        while(curr != null){

            parent = curr;

            if(curr.data < x){
                curr = curr.right;
            }else if (curr.data > x){
                curr = curr.left;
            }

        }


        if(parent == null){
            return temp;
        }

        if(parent.data > x){
            parent.left = temp;
        }else {
            parent.right = temp;
        }

        return root;


    }


    public static void print(Node root ){
        if(root == null){
            return;
        }

        print(root.left);

        System.out.print(root.data + " , ");

        print(root.right);
    }
}
