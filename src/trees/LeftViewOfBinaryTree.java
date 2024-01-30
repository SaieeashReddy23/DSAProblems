package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    public static int maxLevel = 0;


//    For each level print the left most node

    public static void run(Node root){
        method2(root,1);
    }

    public static void method1(Node root){

        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int count = q.size();
            Node leftMost = q.peek();
            System.out.println(leftMost.val);
            for(int i=0; i< count; i++){
                Node curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null) {
                    q.offer(curr.right);
                }
            }
        }

    }


//    This is a recursive sol , in preorder we print left most first at each level

    public static void method2(Node root,int level){

        if(root == null){
            return;
        }

        if(maxLevel < level){
            System.out.println(root.val);
            maxLevel = level;
        }

        method2(root.left,level+1);
        method2(root.right,level+1);


    }

}
