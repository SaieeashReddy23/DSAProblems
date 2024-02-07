package trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {


    private static class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }

    public static void run(Node root){


        Queue<Node> q = new LinkedList<>();

        q.offer(root);



        while(!q.isEmpty()){
            int count = q.size();
            Node prev = null;
            for(int i=0; i< count; i++){
                Node curr = q.poll();

                if(prev == null){
                    prev = curr;
                }else{
                    prev.nextRight = curr;
                    prev = curr;
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }

            prev.nextRight = null;


        }

    }




}
