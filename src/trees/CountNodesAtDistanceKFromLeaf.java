package trees;

public class CountNodesAtDistanceKFromLeaf {



    /*
    *
    * Idea : have an array which will have all the nodes in it and also a pathlen varibale of current path
    *
    *       when leaf node reached check if pathlenght-k-1 is valid then print it .
    *
    *
    *       -> Also maintain a visited array to check if that node is already visited or not
    *
    * */

    public static void run(Node root,int k){

        int[] path = new int[1000];
        boolean[] visited = new boolean[1000];

        countNodes(root , path , visited , 0 , k );

    }

    public static void countNodes(Node root , int[] path , boolean[] visited , int pathlen , int k){

        if(root == null){
            return;
        }

        path[pathlen] = root.val;
        visited[pathlen] = false;
        pathlen++;

        if(root.left == null && root.right == null && (pathlen - k - 1 >= 0) && !visited[pathlen-k-1]){
            System.out.print(path[pathlen-k-1] + "  ,  ");
            visited[pathlen-k-1] = true;
            return;
        }



        countNodes(root.left , path , visited , pathlen , k);
        countNodes(root.right , path , visited , pathlen , k);


    }


}
