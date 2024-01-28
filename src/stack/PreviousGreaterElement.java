package stack;

import java.util.Stack;

public class PreviousGreaterElement {

    public static void run(int[] arr){


        Stack<Integer> stack = new Stack<>();

        stack.push(arr[0]);
        System.out.print("-1   ");

        for(int i=1; i< arr.length; i++){

            while( !stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            int prevGreater = stack.isEmpty() ? -1 : stack.peek();

            System.out.print(prevGreater + "  ");

            stack.push(arr[i]);
        }


    }
}
