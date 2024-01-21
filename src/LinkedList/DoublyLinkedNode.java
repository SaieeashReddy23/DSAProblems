package LinkedList;

public class DoublyLinkedNode {

    private int val;
    private DoublyLinkedNode next;
    private DoublyLinkedNode prev;


    public DoublyLinkedNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DoublyLinkedNode getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode next) {
        this.next = next;
    }

    public DoublyLinkedNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode prev) {
        this.prev = prev;
    }
}
