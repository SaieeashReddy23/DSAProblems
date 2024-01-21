package LinkedList;

public class DetectLoopAndRemoveLoop {



    public static void run(Node head){


        Node fast = head;
        Node slow = head;

        while(fast != null && fast.getNext() !=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow == fast){
                break;
            }
        }


        if(slow != fast){
            System.out.println("No loop detected");
            return;
        }

        slow = head;

        while(slow.getNext() != fast.getNext()){
            slow = slow.getNext();
            fast = fast.getNext();
        }


        fast.setNext(null);





    }

}
