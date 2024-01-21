package LinkedList;

public class SegregateEvenAndOddValues {

    public static void run(Node head){
        print(head);
        head = segEvenAndOdd(head);
        print(head);
    }


    public static Node segEvenAndOdd(Node head){


        Node curr = head;

        Node evenHead = null;
        Node oddHead = null;


        Node currEvenHead = null;
        Node currOddhead = null;


        while(curr != null){

            Node next = curr.getNext();

            curr.setNext(null);

            if(curr.getVal()%2 == 0){
                if(currEvenHead == null){
                    evenHead = curr;
                    currEvenHead = curr;

                }else{
                    currEvenHead.setNext(curr);
                    currEvenHead = curr;
                }

            }else{

                if(currOddhead == null){
                    oddHead = curr;
                    currOddhead = curr;

                }else{
                    currOddhead.setNext(curr);
                    currOddhead = curr;
                }

            }
            curr = next;
        }

        if(currEvenHead == null){
            return  oddHead;
        }

        currEvenHead.setNext(oddHead);


        return  evenHead;

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
