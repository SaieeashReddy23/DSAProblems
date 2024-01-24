package LinkedList;

import java.util.Map;

public class SortZerosonesTwos {

    public static void run(Node head){

        int[] arr = new int[3];

        Node curr = head;

        while(curr != null){
            int val = curr.getVal();
            arr[val]++;
            curr = curr.getNext();
        }

        curr = null;
        Node newHead = null;

        for(int i=0; i< 3 ; i++){
            int freq = arr[i];
            int j = 0;
            while(j < freq){
                Node node = new Node(i);
                if(newHead == null){
                    newHead = node;
                    curr = node;
                }else{
                    curr.setNext(node);
                    curr = node;
                }
                j++;
            }
        }

       print(newHead);


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
