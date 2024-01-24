package LinkedList;

import java.util.*;

public class LRUCacheUsingQueueAndHashMap {

    class Node {
        int key;
        int val;

        Node(int key , int val){
            this.key = key;
            this.val = val;
        }

    }

    private int capacity;

    Deque<Node> queue;

    HashMap<Integer , Node> map;

    public LRUCacheUsingQueueAndHashMap(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        queue = new LinkedList<>();
    }


    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            queue.remove(node);
            queue.addFirst(node);
            return  node.val;
        }
        return -1;
    }

    public void set(int key , int val){
        if(!map.containsKey(key)){
            Node node = new Node(key , val);
            if(map.size() == capacity){
                Node n = queue.removeLast();
                map.remove(n.key);

            }
            queue.addFirst(node);
            map.put(key , node);
        }else{
            Node node = map.get(key);
            node.val = val;
            queue.remove(node);
            queue.addFirst(node);
            map.put(key , node);
        }
    }

    public void print(){
        queue.stream().iterator().forEachRemaining(node -> System.out.print( String.format("Key : %d  and val : %d  ,   " , node.key ,node.val )));
        System.out.println();

        for(Map.Entry<Integer , Node> e :  map.entrySet()){
            Node node = e.getValue();
            System.out.printf("Key : %d  and val : %d  ,      " , node.key ,node.val );
        }

        System.out.println();
    }



}