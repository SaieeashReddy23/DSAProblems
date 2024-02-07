import trees.*;

public class Main {
    public static void main(String[] args) {

        Node root = new Node(10);

//        Node s = new Node(20);

        root.left =new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.right.left.right = new Node(80);



//
//        root.left.left.left = new Node(60);
//        root.left.left.left.left = new Node(70);
//        root.left.left.right = new Node(50);

//        root.left.left.left.left = new Node(60);
//
//        root.left.right.right = new Node(90);
//
//        root.left.right.right.right = new Node(18);

//        root.right.right.left.right = new Node(80);
//
//        root.right.right.right = new Node(80);


        int[] inOrder = { 4 ,8 ,2, 5, 1, 6, 3, 7};
        int[] postOrder = {8, 4 ,5 ,2, 6, 7, 3, 1};

        MaxSumOfNonAdjacentNodes.run(root);

    }


}