package stack;

import java.util.Stack;

public class StockSpan {

    /*
    *
    * Span for a day means , the no of consecutive days previous days including it for which the values are less than or eual to it
    *
    *
    * ideas :-
    *
    *   we use a stack to store the previous greater elements  indexes , for each pos we check lfet most previous greater element and delete
    *
    *           not needed indexes from stack .
    *
    * */


    public static void run(int[] arr){


        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        System.out.print(1 + "  ");

        for(int i=1 ; i < arr.length ; i++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }

            int span = stack.isEmpty() ? i+1 : i -  stack.peek();
            System.out.print(span + "  ");

            stack.push(i);
        }




    }


}
