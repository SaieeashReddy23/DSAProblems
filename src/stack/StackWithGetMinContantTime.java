package stack;

import java.util.Stack;

public class StackWithGetMinContantTime {


    Stack<Integer> st;
    Stack<Integer> aSt;

    public StackWithGetMinContantTime(){
        st = new Stack<>();
        aSt = new Stack<>();
    }

    public  int  push(int x){

        st.push(x);
        if(aSt.isEmpty()){
            aSt.push(x);
            return x;
        }

        if(x < aSt.peek()){
            aSt.push(x);
        }

        return x;
    }

    public int pop(){

        if(st.isEmpty()){
            return -1;
        }
        int popped = st.pop();
        if(popped == aSt.peek()){
            aSt.pop();
        }

        return popped;
    }

    public int getMin(){
        if(st.isEmpty()){
            return -1;
        }
        return  aSt.peek();
    }
}
