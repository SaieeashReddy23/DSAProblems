package LinkedList;

public class MergeSort {

    public static void run(Node head){
        print(head);
        Node res = mergeSort(head);
        print(res);
    }


    public static Node mergeSort(Node head){
        if(head == null || head.getNext() == null){
            return head;
        }

        Node middle = getMiddle(head);
        Node middleNext = middle.getNext();

        middle.setNext(null);

        Node left = mergeSort(head);
        Node right = mergeSort(middleNext);


        Node sorted = sortedMerge(left , right);

        return sorted;


    }

    static Node sortedMerge(Node left , Node right){

        Node result = null;

        if(left == null){
            return right;
        }

        if(right == null){
            return left;
        }


        if(left.getVal() <= right.getVal()){
            result = left;
            result.setNext( sortedMerge(left.getNext() , right));
        }else{
            result = right;
            result.setNext(sortedMerge(left , right.getNext())) ;
        }

        return result;
    }

    static Node getMiddle(Node head){

        if(head == null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        while(fast.getNext() != null && fast.getNext().getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;


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
