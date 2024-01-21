package LinkedList;



public class ReverseLinkedListInGroupsOfK {

    /*
    * In recursive solution Time complexity is O(n) but space complexity is O(n*k)
    *
    * so eff solution is iterative sol
    *
    * */

    public static void run(Node head,int k){
        print(head);
        Node newHead = iterativeReverse(head, k);
        print(newHead);
    }


    public static Node reverse(Node head, int k){

        int count = 0;
        Node curr = head;
        Node prev = null;

        if(head == null){
            return null;
        }

        while(curr != null && count < k){
            Node nextNode = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = nextNode;
            count++;
        }
        head.setNext(reverse(curr , k));

        return prev;
    }



    public static Node iterativeReverse(Node head , int k){

        Node curr = head;
        Node newHead = null;
        Node prevHead = head;
        while (curr != null){
            Node blockHead = curr;
            Node prev = null;
            int count = 0;
            while(curr != null && count < k){
                Node nextNode = curr.getNext();
                curr.setNext(prev);
                prev = curr;
                curr = nextNode;
                count++;
            }
            if(blockHead == head){
                newHead = prev;
            }else{
                prevHead.setNext(prev);
                prevHead = blockHead;
            }


        }


        return newHead;

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
