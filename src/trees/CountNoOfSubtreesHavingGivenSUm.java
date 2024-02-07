package trees;

public class CountNoOfSubtreesHavingGivenSUm {

    static class Res {
        int r = 0;
    }
    public static void run(Node root, int x){

        Res res = new Res();

        sum(root , x , res);

        System.out.println(res.r);
    }

    public static int sum(Node root, int x , Res res){

        if(root == null){
            return 0;
        }

        int leftSum = sum(root.left , x , res);
        int rightSum = sum(root.right , x , res);


        int sum = leftSum + rightSum + root.val;
        if(sum == x){
            res.r++;
        }

        return sum;

    }


}
