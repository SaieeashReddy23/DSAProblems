package recursion;

public class SubsetProb {

 /*
 * If there are n elements then their subset has 2^n elements
 *
 * for example : {a,b,c} = 3
 *
 *      {} , {a} , {b}, {c} , {a,b} , {b,c} , {c,a} , {a,b,c}   = 2^3  =  8
 *
 * */
    public static void run(int[] arr , int sum ){

        int retval = subset(arr , arr.length , 0 , sum);

        System.out.println(retval);


    }


//    Time complexity is O(2^n)
    public static int subset(int[] arr ,int n , int curSum , int reqSum){

        if(n == 0){
            return curSum == reqSum ? 1 : 0;
        }

        int left =subset(arr , n-1 , curSum , reqSum);
        int right = subset(arr , n-1 , curSum + arr[n-1]  , reqSum );

        return left + right;

    }

}
