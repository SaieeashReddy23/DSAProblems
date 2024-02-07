package trees;

public class CheckIfSubtree {

    public static void run(Node t , Node s){

        if(isSubtree(t , s)){
            System.out.println(" it is a subtree");
        }else{
            System.out.println("it is not a subtree");
        }
    }

    public static boolean isSubtree(Node t , Node s){

        if(t == null){
            return false;
        }

        if(isTreeMatching(t , s)){

            return true;
        }

        return isSubtree(t.left , s) ||  isSubtree(t.right , s);

    }

    public static boolean isTreeMatching(Node root , Node s){
        if(root == null && s == null){
            return true;
        }

        if(root == null || s == null ){
            return false;
        }


        if(root.val != s.val){
            return false;
        }



        return isTreeMatching(root.left , s.left) &&     isTreeMatching(root.right , s.right);

    }

}
