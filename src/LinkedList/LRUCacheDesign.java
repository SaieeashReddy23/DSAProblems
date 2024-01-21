package LinkedList;

import java.util.HashMap;

public class LRUCacheDesign {

    private int MAX_SIZE;
    private int currSize;

    private DoublyLinkedNode head;

    private DoublyLinkedNode tail;

    private HashMap<Integer , DoublyLinkedNode> map;

    public LRUCacheDesign(int  maxSize){
        this.MAX_SIZE = maxSize;
        this.map = new HashMap<>();
    }



    public void refer(int x){

        boolean isHit = map.containsKey(x);



        if(isHit){
            System.out.println(x +" is a HIT");
            DoublyLinkedNode node = map.get(x);

            if(node == head){

            }else if (node == tail){
                DoublyLinkedNode prevNode =  node.getPrev();
                prevNode.setNext(null);
                tail = prevNode;
                insertAtHead(node);
            }else {
                DoublyLinkedNode prevNode =  node.getPrev();
                DoublyLinkedNode nextNode =  node.getNext();
                prevNode.setNext(nextNode);
                nextNode.setPrev(prevNode);
                node.setPrev(null);
                node.setNext(null);
                insertAtHead(node);
            }

        }else{
            System.out.println(x +" is a Miss");
            DoublyLinkedNode node = new DoublyLinkedNode(x);
            map.put(x , node);
            if(currSize == MAX_SIZE){
                deleteAtTail();
                insertAtHead(node);
            }else{
                currSize++;
                insertAtHead(node);
            }
        }

        print();
    }


    private void insertAtHead(DoublyLinkedNode node){
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        node.setNext(head);
        node.setPrev(null);
        head.setPrev(node);
        head = node;
    }

    private void deleteAtTail(){
        DoublyLinkedNode prevNode = tail.getPrev();
        prevNode.setNext(null);
        tail = prevNode;
    }



    public void print(){
        System.out.println("current size is : " + currSize);
        DoublyLinkedNode curr =  head;
        while(curr !=  null){
            System.out.print(curr.getVal() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }





}
