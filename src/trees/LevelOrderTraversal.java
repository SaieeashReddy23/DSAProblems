package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {


    public static void run(Node root){
        method2(root);
    }


    /*
    *
    * We will pass null after end of each row , by this we can differetiate between levels
    *
    * */

    public static void method1(Node root){

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);

        while(q.size() > 1){
            Node curr = q.poll();
            if(curr == null){
                System.out.println();
                q.offer(null);
                continue;
            }

            System.out.print(curr.val + " , ");
            if(curr.left != null){
                q.offer(curr.left);
            }

            if(curr.right != null) {
                q.offer(curr.right);
            }


        }

    }


    public static void method2(Node root){

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0; i< count; i++){
                Node curr = q.poll();
                System.out.print(curr.val + " , ");
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
            System.out.println();
        }

    }
}
