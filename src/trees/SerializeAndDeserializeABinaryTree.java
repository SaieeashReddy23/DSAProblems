package trees;

import java.util.ArrayList;

public class SerializeAndDeserializeABinaryTree {


        /*
        *
        * Idea is : we use any traversal for serializationa and deserialization and where evere we get null we place =1
        *
        * */


    public static int index = 0;

    public static  void run(Node root){

        System.out.println("Initial");
        printTree(root);

        System.out.println();

        ArrayList<Integer> arr = new ArrayList<>();

        serialize(root , arr);

        System.out.println("serialized");
        print(arr);


        Node head = deserialize(arr);


        System.out.println("deserialized");

        printTree(head);



    }


    public static void serialize(Node root , ArrayList<Integer> arr ){

        if(root == null){
            arr.add(-1);
            return;
        }

        arr.add(root.val);

        serialize(root.left , arr );
        serialize(root.right , arr);

    }

    public static Node deserialize(ArrayList<Integer> arr){

        if(index == arr.size()){
            return null;
        }

        int val = arr.get(index);
        index++;

        if(val == -1){
            return null;
        }


        Node root = new Node(val);

        root.left = deserialize(arr );
        root.right = deserialize(arr);

        return root;

    }


    public static void print(ArrayList<Integer> arr ){

        for(int i : arr){
            System.out.print(i + " ,");
        }
        System.out.println();

    }

    public static void printTree(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.val + " , ");

        printTree(root.left);
        printTree(root.right);


    }




}
