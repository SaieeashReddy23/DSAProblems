package stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostFix {


    /*
    *
    * create stack and iterate throught every char left to right
    *
    * -> if it is a operand then print it
    *
    * -> if it is a open bracket , push it to stack
    *
    * -> if it is a closed bracket , pop all until you see opening backet
    *
    *
    * operator :-
    *
    *       -> if st empty then push it to stack
    *
    *       -> Higher prcedence - push to stack
    *
    *       -> Lower precednec  -  pop until its lower precedence
    *
    *
    *       -> Equal prcednece :-
    *
    *               -> Based on assiciativity if left to right : left is higher precednec and now the curr is lower precednec
    *
    *                -> else revere
    *
    *
    * */

    public static void run(String s){


        System.out.println(postFix(s));

    }


    public static String postFix(String s){


        HashMap<Character , Integer> precMap = new HashMap<>();

        precMap.put('+', 1);
        precMap.put('-', 1);
        precMap.put('*', 2);
        precMap.put('/', 2);
        precMap.put('^', 3);
        precMap.put('(', 0);
        precMap.put(')', 0);


        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();


        for(char c : s.toCharArray()){

            if((c >='a' && c <='z') || (c >='A' && c <= 'Z') || (c >= '0' && c <='9') ){
                sb.append(c);
            }else if (c == '('){
                st.push(c);
            }else if (c ==')'){
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                }
                st.pop();
            }else {
                // Lower porecednec and equal precedence as it said forget about ^ right to left associativity
                while(!st.isEmpty() && (precMap.get(c) < precMap.get(st.peek()) || ( precMap.get(c) == precMap.get(st.peek())) && c != '^') ){
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }


        return new String(sb);


    }
}
