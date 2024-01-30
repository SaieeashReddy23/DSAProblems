import trees.*;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(20);

        root.left = new Node(8);
        root.right = new Node(12);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(60);
        root.right.right.left = new Node(70);

        root.right.left = new Node(25);
//        root.right.right.left.right = new Node(80);
//
//        root.right.right.right = new Node(80);

        MaxWidthofBinaryTree.run(root);

    }


}