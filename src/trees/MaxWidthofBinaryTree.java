package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthofBinaryTree {

    public static void run(Node root){

        System.out.println(method1(root));
    }

    public static int method1(Node root){

        Queue<Node> q = new LinkedList<>();

        int maxSize = 0;

        q.offer(root);


        while(!q.isEmpty()){

            int count = q.size();

            maxSize = Math.max(maxSize , count);

            for(int i=0; i< count ; i++){
                Node curr = q.poll();

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }


            }


        }

        return maxSize;



    }
}
