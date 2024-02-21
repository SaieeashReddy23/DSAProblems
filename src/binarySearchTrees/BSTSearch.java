package binarySearchTrees;

public class BSTSearch {

//    Note only ditinct values are given  in BST


    public static void run(Node root, int key){

        if(iterativeSol(root,key)){
            System.out.println("it is found");
        }else{
            System.out.println("It is not found");
        }

    }

    public static boolean search(Node root , int key){

        if(root == null){
            return false;
        }

        boolean isFound = false;

        if(root.data < key){
            isFound = search(root.right , key);
        }

        if(root.data > key){
            isFound = search(root.left , key);
        }

        return root.data == key || isFound;

    }


    public static boolean iterativeSol(Node root,int key){


        while(root != null){
            if(root.data == key){
                return true;
            }

            else if(root.data < key){
                root = root.right;
            }
            else {
                root = root.left;
            }

        }

        return false;
    }

}
