import binarySearchTrees.*;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(10);

//        root.left = new Node(5);
////        root.left.left = new Node(15);
//
//        root.right = new Node(15);
//        root.right.left = new Node(12);
//        root.right.right = new Node(18);
//        root.right.right.left = new Node(17);
//        root.right.right.right = new Node(21);

        root.left = new Node(20);

        root.left.left = new Node(30);
        root.left.right = new Node(40);

        root.right = new Node(50);
        root.right.left = new Node(60);
//        root.right.right = new Node(50);
//        root.right.right.left = new Node(17);
//        root.right.right.right = new Node(21);
//        root.right.left.left = new Node(6);


//
//        VerticalTraversalOfBinaryTree.run(root );

//        Node root = new Node(50);
//        FindKthSmallest.insert(root , 20);
//        FindKthSmallest.insert(root , 100);
//        FindKthSmallest.insert(root , 10);
//        FindKthSmallest.insert(root , 40);
//        FindKthSmallest.insert(root , 4);
//        FindKthSmallest.insert(root , 70);
//        FindKthSmallest.insert(root , 120);
//        FindKthSmallest.insert(root , 60);
//        FindKthSmallest.insert(root , 80);
//        FindKthSmallest.print(root);
//        System.out.println("==========================================");
//
//        FindKthSmallest.findKthSmallest(root , 11);


        int[] pre = {7,4,12,3,6,8,1,5,10};

        ConvertLevelorderTraversalToBST.run(pre);
    }


}