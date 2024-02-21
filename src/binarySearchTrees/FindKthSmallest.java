package binarySearchTrees;


//Design a datastructure with which you can do , search , insert , delete and findKthSmallest

/*
*
*
* To find the KthSmallest  , we will modify the node structure , add lcount variable which stores the count of left nodes
* */

public class FindKthSmallest {

    public static Node insert(Node root , int x){

        Node temp = new Node(x);

        Node parent = null;
        Node curr = root;

        while(curr != null){

            parent = curr;

            if(curr.data < x){
                curr = curr.right;
            }else if (curr.data > x){
                curr.lcount++;
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


    public static void findKthSmallest(Node root , int k){


        while(root != null){
            if(root.lcount + 1 == k ){
                System.out.println(k + "th smallest element is " + root.data);
            }
            if(root.lcount + 1 > k ){
                root = root.left;
            }else{
                k = k - root.lcount - 1;
                root = root.right;
            }
        }

    }


    public static void print(Node root){

        if(root == null){
            return;
        }

        print(root.left);
        System.out.println("Node value is " + root.data + "  and its lcount value is " + root.lcount);
        print(root.right);

    }





}
