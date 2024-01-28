package stack;

import java.util.Stack;

public class LargestRectangleAreaInHistogram {

    /*
    *
    * Idea : find the prevSmallest and nextSmallest for each element and  based on which you can get largest rectangle area
    *
    *
    *
    * */


    public static void run(int[] arr){

        int n = arr.length;

//       prevSmallest

        Stack<Integer> stack = new Stack<>();

        int[] prev = new int[n];
        stack.push(0);
        prev[0] = -1;

        for(int i=1; i< n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i] ){
                stack.pop();
            }

            int prevSmall = stack.isEmpty()  ? -1 : stack.peek() ;

            prev[i] = prevSmall;

            stack.push(i);
        }


//        nextSmall


        Stack<Integer> stack2 = new Stack<>();

        int[] next = new int[n];
        stack2.push(n-1);
        next[n-1] = n;

        for(int i = n-2; i >= 0; i--){
            while(!stack2.isEmpty() && arr[stack2.peek()] >= arr[i] ){
                stack2.pop();
            }

            int nextSmall = stack2.isEmpty()  ? n : stack2.peek() ;

            next[i] = nextSmall;

            stack2.push(i);
        }


        print(arr , "original array");
        print(prev , "prev array");
        print(next , "Next array");


        int res = 0;

        for(int i=0; i< n ; i++){
            int curr = arr[i];
            curr += (i - prev[i] - 1 )*arr[i];
            curr += (next[i] - i - 1 )*arr[i];
            res =Math.max(res , curr);
        }


        System.out.println(res);

    }


    public static  void print(int[] arr ,String title){
        System.out.println(title);
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
    }





}
