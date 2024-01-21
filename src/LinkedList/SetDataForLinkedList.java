package LinkedList;

public class SetDataForLinkedList {

    public static Node run(int[] arr){

        Node head = null;
        Node prev = null;

        for(int i=0; i< arr.length; i++){
            Node curr = new Node(arr[i]);
            if(prev == null){
                head = curr;
                prev = curr;
            }else{
                prev.setNext(curr);
                prev = curr;
            }
        }

        return head;
    }

}
