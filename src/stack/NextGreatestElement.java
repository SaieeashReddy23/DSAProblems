package stack;

import java.util.Stack;

public class NextGreatestElement {

    public static void run(int[] arr){
        Stack<Integer> stack = new Stack<>();

        System.out.print("-1   ");

        stack.push(arr[arr.length-1]);

        for(int i=arr.length-2; i>=0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            int nextGreater = stack.isEmpty() ? -1 : stack.peek();

            System.out.print( nextGreater + "   ");
            stack.push(arr[i]);


        }
    }
}
