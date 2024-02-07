package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarytreeFromLinkedList {


class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

    public Tree run(Node head) {
        Node currInList = head;

        Queue<Tree> q = new LinkedList<>();

        Tree treeHead = new Tree(head.data);

        q.offer(treeHead);

        currInList = currInList.next;


        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0; i< count; i++){
                Tree curr = q.poll();

                if(currInList != null){
                    curr.left = new Tree(currInList.data);
                    currInList = currInList.next;
                }

                if(currInList != null){
                    curr.right = new Tree(currInList.data);
                    currInList = currInList.next;
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }

            }
        }

        return treeHead;

    }

}
