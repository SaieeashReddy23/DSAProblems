package trees;

import java.util.Map;

public class MaximumPathSumFromAnyNode {


    /*
    *
    * Idea :-
    *       -> has only node , node _ maxof left or right
    *
    *       -> node + left max + rightmax
    *
    *
    *
    * */

    private static class Res {
        private int val;
    }

    public static void run(Node root){

        Res res = new Res();
        res.val = Integer.MIN_VALUE;

        maxpath(root , res);


        System.out.println(res.val);

    }


    public static int maxpath(Node root , Res res){

        if(root == null){
            return 0;
        }

        int l = maxpath(root.left , res);
        int r = maxpath(root.right , res);


        int maxSingle = Math.max(Math.max(l,r) + root.val , root.val );


        int maxTop = Math.max((l + r + root.val) , maxSingle);


        res.val = Math.max(maxTop ,res.val );

        return maxSingle;

    }
}
