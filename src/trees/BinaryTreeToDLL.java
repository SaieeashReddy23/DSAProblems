package trees;

public class BinaryTreeToDLL {


    private static Node prev = null;
    private static Node head = null;

    public static void run(Node root){
        method1(root);


//        For circular linked list connect prev and head

        System.out.println( "Prev val " + prev.val);
        System.out.println( "Head val " + head.val);

        print();
    }


    public static Node method1(Node root){

        if(root == null){
            return null;
        }

        method1(root.left);

        if(prev == null){
            head = root;
        }else{
            root.left = prev;
            prev.right = root;
        }

        prev = root;

        method1(root.right);

        return head;
    }

    public static void print(){

        while(head != null){
            System.out.print(head.val + " , ");
            head = head.right;
        }

    }
}
