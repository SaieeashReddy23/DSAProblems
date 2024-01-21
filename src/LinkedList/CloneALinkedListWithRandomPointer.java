package LinkedList;

import java.util.HashMap;

public class CloneALinkedListWithRandomPointer {


  /*
  *
  * 2 ideas : one idea is create a hashmap of present node and a new node with its value
  *
  *         with this you get the random nodes copy node and you can create a copy list
  *
  *
  * 2nd idea :-
  *
  *         -> place new nodes next to each node in the linked list
  *
  *         -> Node look at the porblem and randomnodes of the curr will be randomnode.next (uyou got the idea)
  *
  *
  * */



    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val){
            this.val = val;
        }
    }


    public static void run(Node head){
        HashMap<Node , Node> map = new HashMap<>();

        Node curr = head;

        while (curr != null){

            Node node = new Node(curr.val);

            map.put(curr , node);
        }

        curr = head;

        while (curr != null){
            Node node = map.get(curr);
            node.next = map.get(curr.next);
            node.random = map.get(curr.random);
        }

        head = map.get(head);



    }


}
