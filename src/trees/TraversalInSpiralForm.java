package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalInSpiralForm {

    public static void run(Node root){

        method2(root);
    }


    public static void method1(Node root){
        Queue<Node> q = new LinkedList<>();

        q.offer(root);

        int temp = 0;

        while(!q.isEmpty()){
            int count = q.size();
            Stack<Integer> st = new Stack<>();

            for(int i = 0 ; i< count ; i++){
                Node curr =  q.poll();

                if(temp%2 == 1){
                    st.push(curr.val);
                }else{
                    System.out.print(curr.val + " , ");
                }

                if(curr.left != null){
                    q.offer(curr.left);
                }

                if(curr.right != null){
                    q.offer(curr.right);
                }
            }

            if(temp%2 == 1){
                while(!st.isEmpty()){
                    System.out.print(st.pop() + " , ");
                }
            }
            temp++;
            System.out.println();
        }
    }



//    We use two stacks to do this

    public static void method2(Node root){

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while(!s1.isEmpty() || !s2.isEmpty()){

            while(!s1.isEmpty()){
                Node curr = s1.pop();
                System.out.print(curr.val + " ,");
                if(curr.left != null){
                    s2.push(curr.left);
                }
                if(curr.right != null){
                    s2.push(curr.right);
                }

            }

            while(!s2.isEmpty()){
                Node curr = s2.pop();
                System.out.print(curr.val + " ,");
                if(curr.right != null){
                    s1.push(curr.right);
                }
                if(curr.left != null){
                    s1.push(curr.left);
                }

            }

        }

    }
}
