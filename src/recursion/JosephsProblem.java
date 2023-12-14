package recursion;

public class JosephsProblem {

    /*
    * People are seated around a table , a gun is passed and after k positions the person in that position is killed .
    * Find out the person in which position he is after killing all others except him
    *
    * Should be done in recursive
    *
    *
    * After every recursion , prev position will be pres pos + K , so from 0th position as base condition we start finding the original pos
    *
    * Time complexity is O(n)
    *
    * */
    public static void run(int n , int k){

        int pos = jospthProb(n, k);

        System.out.println(String.format("%d th pos is returned", pos));

    }

    public static int jospthProb(int n , int k){
//        Base cases
        if(n == 1){
            return 0;
        }

        //        Recursive


        int retVal = (jospthProb(n-1 , k) + k)%(n);
        return retVal;

    }
}
