package LinkedList;

public class MergeTwoSortedLinkedLists {

    public static void run(Node h1 , Node h2){
        print(merge(h1 , h2));
    }

    public static Node merge(Node h1 , Node h2){
        Node curr1 = h1;
        Node curr2 = h2;

        Node newHead = null ;
        Node curr3 = null;

        if(curr1 == null){
            return  h2;
        }

        if(curr2 == null){
            return h1;
        }

        while(curr1 != null && curr2 != null ){
            if(curr1.getVal()  < curr2.getVal()){
                if(curr3 == null){
                    curr3 = curr1;
                    newHead = curr1;
                }else{
                    curr3.setNext(curr1);
                    curr3 = curr1;
                }
                curr1 = curr1.getNext();
            }else{
                if(curr3 == null){
                    curr3 = curr2;
                    newHead = curr2;
                }else{
                    curr3.setNext(curr2);
                    curr3 = curr2;
                }

                curr2 = curr2.getNext();
            }
        }

        if(curr1 != null){
            curr3.setNext(curr1);
        }

        if(curr2 != null){
            curr3.setNext(curr2);
        }

        return newHead;
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
