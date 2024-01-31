package trees;

public class BurnABinaryTreeFromLeaf {


    /*
    *
    * Time to burn a binary tree from a leaf node
    *
    * idea : Farthest node from the given node
    *
    * */

    private static int res = 0;

    private static class Distance{
        int dist;
        Distance(int val){
            this.dist = val;
        }
    }



    public static void run(Node root){

        method1(root ,50 , new Distance(-1));

        System.out.println(res);

    }

    /*
    *
    *  idea is : get the fathest node reacheable throgh one of its ancestors and also height of other subtree
    *
    *           -> For Each node we calculate 2 values height and also distance from the leaf node , if a node is
    *               not the ancestor of the leaf node then distance will be -1;
    *
    *           -> we try to get the farthest distance node from leaf;
    *
    *           -> we assume that leaf is a correct node , not some child node
    *
    *
    * */

    public static int method1(Node root , int leaf , Distance distance){

        if(root == null){
            return 0;
        }

        if(root.val == leaf){
            distance.dist = 0;
        }

        Distance leftDis = new Distance(-1);
        Distance rightDis = new Distance(-1);


        int leftHeight = method1(root.left , leaf , leftDis);
        int rightHeight = method1(root.right , leaf , rightDis);

        if(leftDis.dist != -1){
            distance.dist = leftDis.dist + 1;
            res = Math.max(res , rightHeight + distance.dist);

        }

        if (rightDis.dist != -1){
            distance.dist = rightDis.dist + 1;
            res = Math.max(res , leftHeight + distance.dist);
        }

        return Math.max(leftHeight , rightHeight) + 1;

    }

}
