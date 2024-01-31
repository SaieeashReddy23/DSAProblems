import trees.*;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

//        root.right.left = new Node(40);
//        root.right.right = new Node(50);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.left.left.left = new Node(60);
        root.left.left.left.left = new Node(70);
//        root.left.left.right = new Node(50);

//        root.left.left.left.left = new Node(60);
//
//        root.left.right.right = new Node(90);
//
//        root.left.right.right.right = new Node(18);

//        root.right.right.left.right = new Node(80);
//
//        root.right.right.right = new Node(80);

        SerializeAndDeserializeABinaryTree.run(root);

    }


}