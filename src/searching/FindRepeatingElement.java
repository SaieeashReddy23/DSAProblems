package searching;

import java.util.Arrays;

public class FindRepeatingElement {

    /*
    * Array size : n>=2
    * Only one element is repeating , any number of times
    * all the elements from 0 to max are present
    *
    * therefore 0 <= max <= n-2
    *
    *
    * constrains :-
    *
    *       O(n) - linear time
    *
    *       O(1) - constant Auxilay space
    *
    *       No modifications to array
    *
    *
    *       sols :-
    *
    *           -> naive solution - O(n^2) - count if >1
    *           -> sort and then if side by side elements match - O(nlog(n))
    *           -> Boolean array - O(n) , but auxilary space is not constant
    *
    *
    *       Eff sol :-
    *
    *           -> Fast and slow approach
    *
    *           1st step :- if a cycle exists then fast and slow meet at a point inside the cycle
    *
    *           2nd step :- from the fast pos and slow at startung pos if both start at same speed , then they meet at the cycle starting elemnt
    *
    *
    * */
    public static void run(int[] arr){

        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(slow);
        System.out.println(fast);

    }
}
