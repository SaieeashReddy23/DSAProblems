package LinkedList;

import java.util.HashMap;

public class LRUCacheDesign {



    /*
    * Idea: using a doubly linked List and HashMap
    *
    *       -> The head and tail will be seperate node no values will be there inside it , so that it would be easy
    *
    *           when coding
    *
    *
    * */

    private class Node {
        Integer key;
        Integer val;
        Node prev;
        Node next;
        Node(Integer key , Integer val){
            this.key = key;
            this.val = val;
        }
    }

    private int capacity;
    private static Node head;
    private static Node tail;
    private  HashMap<Integer , Node> cache;
    //Constructor for initializing the cache capacity with the given value.
    LRUCacheDesign(int cap)
    {
        capacity = cap;
        cache = new HashMap<>();
        head = new Node(null , null);
        tail = new Node(null , null);
        head.next = tail;
        tail.prev = head;
    }

    //Function to return value corresponding to the key.
    public int get(int key)
    {
        // your code here
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            moveToHead(node);
            return  node.val;
        }
        return -1;
    }

    //Function for storing key-value pair.
    public void set(int key, int val)
    {
        if(!cache.containsKey(key)){
            Node node = new Node(key , val);
            if(cache.size() == capacity){
                removeTail();
                cache.remove(key);
            }
            addToHead(node);
            cache.put(key , node);
        }else{
            Node node = cache.get(key);
            node.val = val;
            moveToHead(node);
            cache.put(key , node);
        }
    }


    public void removeNode(Node node){
        Node prevNode = node.prev;
        Node nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void addToHead(Node node){
        Node nextNode = head.next;
        node.next = nextNode;
        nextNode.prev = node;
        head.next = node;
        node.prev = head;
    }


    public void moveToHead(Node node){
        removeNode(node);
        addToHead(node);
    }

    public void removeTail(){
        Node prevNode = tail.prev;
        cache.remove(prevNode.key);
        removeNode(prevNode);
    }

}
