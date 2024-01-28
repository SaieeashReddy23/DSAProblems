package stack;

import java.util.Stack;

public class LargestRectangeWithAllOnes {

    /*
    *
    * Idea is think of it as a histogram problem , but  with each row as base row calculatte area , from top to bottom
    *
    *
    * */


    public static void run(int[][] arr){

        int res = largestHist(arr[0]);


        for(int row = 1; row < arr.length ; row++){
            for(int i=0; i< arr[row].length ; i++){
                if(arr[row][i] == 1){
                    arr[row][i] += arr[row-1][i];
                }

            }

            int curr = largestHist(arr[row]);
            res = Math.max(res , curr);
        }

        printMatrix(arr);

        System.out.println("largest ones rectange is " + res);



    }


    public static int largestHist(int[] arr){

        int n = arr.length;

//        PrevSmallerArray

        int[] prev = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);
        prev[0] = -1;

        for(int i=1; i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            int prevVal = st.isEmpty() ? -1  : st.peek();
            prev[i] = prevVal;
            st.push(i);
        }





//        NextSmallerArray

        int[] next = new int[n];

        Stack<Integer> st2 = new Stack<>();

        st2.push(n-1);
        next[n-1] = n;

        for(int i=n-2; i>=0;i--){
            while(!st2.isEmpty() && arr[st2.peek()] >= arr[i]){
                st2.pop();
            }
            int nextVal = st2.isEmpty() ? n  : st2.peek();
            next[i] = nextVal;
            st2.push(i);
        }

//        print(arr , "original array");
//        print(prev , "prev array");
//        print(next , "Next array");
//


//        MaxArea

        int res = 0;

        for(int i=0; i< n; i++){
            int curr = arr[i];
            curr += arr[i]*(i - prev[i] - 1);
            curr += arr[i]*(next[i] - i - 1);
            res = Math.max(res , curr);
        }

//
//        System.out.println(res);


        return res;
    }


    public static  void print(int[] arr ,String title){
        System.out.println(title);
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + "  ");
        }

        System.out.println();
    }


    public static void printMatrix(int[][] arr){

        for(int i=0; i< arr.length; i++){
            for(int j=0; j < arr[i].length ; j++){
                System.out.print( arr[i][j] + " , ");
            }
            System.out.println();
        }

    }



}
