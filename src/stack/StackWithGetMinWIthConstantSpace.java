package stack;

import java.util.Stack;

public class StackWithGetMinWIthConstantSpace {

//    Assume all are postive numbers

//    to havndle negative also , doubt the min


    Stack<Integer> st ;
    int min = 0;

    public StackWithGetMinWIthConstantSpace(){
        st = new Stack<>();
    }


    public int push(int x){

        if(st.isEmpty()){
            min = x;
            st.push(x);
        }else if (x <= min){
            st.push(2*x-min);
            min = x;
        }else{
            st.push(x);
        }

        return x;
    }

    public int pop(){

        int t= st.pop();

        if(t <= min){
            int res = min;

            min = 2*min - t;

            return res;
        }else{
            return t;
        }

    }

    public int getMin(){
        return min;
    }

    public int getPeek(){
        int t = st.peek();
        return t <= min ? min : t;
    }





}
