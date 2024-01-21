package LinkedList;

public class DeleteANodeWithOnlyOnePointerGiven {

    /*
    *
    * Idea is trasfer next element tothe current elemnt and delete the next node
    *
    * The node which you need to deletw will not be the last node
    *
    * */


    public static void run(Node p){
        p.setVal(p.getNext().getVal());
        p.setNext(p.getNext().getNext());
    }

}
