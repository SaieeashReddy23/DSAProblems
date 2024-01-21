package LinkedList;

public class LenghtOfLoop {

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


        int count = 0;
        while(slow != fast){
            slow = slow.getNext();
            count++;
        }

        System.out.println(count + " is the length of the loop");



    }
}
