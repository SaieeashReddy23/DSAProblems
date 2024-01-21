package LinkedList;

public class DetectLoop {

    public static void run(Node head){

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.getNext() !=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow == fast){
                System.out.println("Loop is detected");
                return;
            }
        }

        System.out.println("Loop is not detected");

    }
}
