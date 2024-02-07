package trees;

public class DetermineIfTwoTreesAreIdentical {

    public static void run(Node root1 , Node root2){

        if(method1(root1 , root2)){
            System.out.println("They are identical");
        }else{
            System.out.println("They are not identical");
        }

    }


    public static boolean method1(Node root1 , Node root2){

        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }


        if(root1.val != root2.val){
            return false;
        }


        boolean isLeftIdentical = method1(root1.left , root2.left);
        boolean isRightIdentical = method1(root1.right , root2.right);

        return isLeftIdentical && isRightIdentical;
    }

}
