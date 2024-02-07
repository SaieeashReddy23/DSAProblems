package trees;

import java.util.HashMap;

public class MaxSumOfNonAdjacentNodes {


    /*
    *
    * Idea : two values sum of node valuu + its grand children
    *
    *                   other one  sum of chilren sums
    *
    *
    *   which ever max , choose that
    *
    *   and also store the sums in the hashmap
    *
    * */


    public static void run(Node root){

        HashMap<Node , Integer> mp = new HashMap<>();

        int sum = maxSum(root,mp);

        System.out.println(sum);

    }

    public static int maxSum(Node root , HashMap<Node,Integer> mp){

        if(root == null){
            return 0;
        }


        if(mp.containsKey(root)){
            return mp.get(root);
        }


        int incl = root.val + grandChildSum(root , mp);


        int exc = maxSum(root.left , mp) + maxSum(root.right , mp);

        mp.put(root , Math.max(incl,exc));

        return mp.get(root);
    }

    public static int grandChildSum(Node root , HashMap<Node,Integer> mp){

        int sum = 0;

        if(root !=null &&root.left != null){
            sum += maxSum(root.left.left,mp) + maxSum(root.left.right,mp);
        }

        if(root !=null && root.right != null){
            sum += maxSum(root.right.left,mp) + maxSum(root.right.right,mp);
        }

        return sum;

    }
}
