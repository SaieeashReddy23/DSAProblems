package stack;

import java.util.Stack;

public class EvaluationOfPostFix {

    public static void run(String s){
        Stack<Integer> st = new Stack<>();

        StringBuilder sb = new StringBuilder();


        for(char c : s.toCharArray()){


            if(Character.isDigit(c)){
                st.push(Integer.parseInt(c+""));
            }else{
                int op1 = st.pop();
                int op2 = st.pop();

                int res = 0;
                switch(c){
                    case '+' :
                        res = op2 + op1;
                        break;
                    case '-' :
                        res = op2 - op1;
                        break;
                    case '*' :
                        res = op2*op1;
                        break;
                    case '/' :
                        res = op2 / op1;
                        break;
                    case '^' :
                        res = op2 ^ op1;
                        break;
                }

                st.push(res);

            }
        }

        System.out.println(st.pop());
    }
}
