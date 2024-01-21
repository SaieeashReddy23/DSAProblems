package LinkedList;

public class PairWiseSwapNodesOfLinkedList {


    /*
    * Two ideas :- swap data or move pointers
    *
    * */


    public static void run(Node head){

        print(head);
        Node newHead = swap(head);
        print(newHead);

    }

    public static Node swap(Node head){

        if(head == null){
            return null;
        }

        Node curr = head;

        int count = 0;
        Node prev = null;

        while(curr != null && count < 2){
            Node next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
            count++;
        }

        head.setNext(swap(curr));

        return  prev;


    }


    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.getVal() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }


}
