package trees;

public class MaxDiffBetweenNodeAndItsAncestor {

    static class Res {
        int r = Integer.MIN_VALUE;
    }

    public static void run(Node root){


        Res res = new Res();

        rec(root ,res );

        System.out.println(res.r);



    }

    private static int rec(Node t , Res res){

        if (t == null)
            return Integer.MAX_VALUE;

        if (t.left == null && t.right == null)
            return t.val;


        int val = Math.min(rec(t.left, res),
                rec(t.right, res));

        res.r = Math.max(res.r, t.val - val);

        return Math.min(val, t.val);
    }



}
