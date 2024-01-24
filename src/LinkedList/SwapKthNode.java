package LinkedList;

public class SwapKthNode {


    /*
    * Idea is find the prev and currposition of those nodes
    *
    *
    * 3 corner cases to look for
    *
    *    1. if k is > lenght of list - not possible to swap
    *    2. from left and right same pos - so no need
    *    3. if both nodes are side by side , i mean lenght is 2 ;
    *
    *
    *
    *
    * */

    public static void run(Node head, int num , int k){

        swapKthNode(head , num , k);

    }


    public static Node swapKthNode(Node head, int num , int k){

        if(num < k){
            return head;
        }
        int first = k;
        int second = num - k + 1;

        if(second < first){
            first = second;
            second = k;
        }

        Node curr = head;
        Node prev = null;

        Node a = null;
        Node b = null;

        Node prevA = null;
        Node prevB = null;

        int count = 0;
        while(curr != null){
            count++;
            if(count == first){
                a = curr;
                prevA = prev;

            }

            if(count == second){
                b = curr;
                prevB = prev;
            }

            prev = curr;
            curr = curr.getNext();
        }

        if(num == 2){
            b.setNext(prevB);
            prevB.setNext(null);
            head = b;
            return head;
        }


        if(first == 1){
            b.setNext(a.getNext());
            head = b;
            prevB.setNext(a);
            a.setNext(null);
        }else{
            a.setNext(b.getNext());
            b.setNext(a.getNext());

            prevB.setNext(a);
            prevA.setNext(b);
        }

        return head;
    }
}
