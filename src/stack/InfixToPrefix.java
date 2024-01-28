package stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPrefix {


    /*
    *
    *
    * -> revers expression , converto postfix and then reverse it again
    *
    * */


    public static void run(String s){


        StringBuilder sb = new StringBuilder(s);



        String res = InfixToPostFix.postFix(new String (sb.reverse()));

        sb = new StringBuilder(res);

        System.out.println(sb.reverse());

    }


}
