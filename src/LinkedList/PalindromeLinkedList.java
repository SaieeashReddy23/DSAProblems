package LinkedList;

public class PalindromeLinkedList {

    /*
    * Idea 1 : use stack
    *
    * Idea 2 :- reverse second half of list and now compare 1st with second half first
    *
    *
    * */

    public static void run(Node head){


        Node slow = head;
        Node fast = head;


//        To find middle we check untill fast.next && fast.next.next != null ,
//        IN normal to find loop we do until fast != null && fast.next != null

        while(fast.getNext() != null && fast.getNext().getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

//        Slow is the midpoint now;

        Node rev = reverse(slow.getNext());


        Node curr = head;

        while(rev != null){
            if(curr.getVal() != rev.getVal()){
                System.out.println("it is not a palindrom");
                return;
            }

            rev = rev.getNext();
            curr = curr.getNext();
        }

        System.out.println("it is a palindrome");


    }


    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;

        while (curr != null){

            Node next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        return  prev;
    }


    public static void print(Node head){
        Node curr = head;
        while(curr !=  null){
            System.out.print(curr.getVal() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

}
