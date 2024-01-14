package Strings;

public class KeyPadTyping {

    public static void run(String s){

        StringBuilder sb = new StringBuilder();

        char[] keyPadArr = new char[256];

        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
            if("abc".indexOf(c) >= 0){
                keyPadArr[c] = '2';
            }else if ("def".indexOf(c) >= 0){
                keyPadArr[c] = '3';
            }else if ("ghi".indexOf(c) >= 0){
                keyPadArr[c] = '4';
            }else if ("jkl".indexOf(c) >= 0){
                keyPadArr[c] = '5';
            }else if ("mno".indexOf(c) >= 0){
                keyPadArr[c] = '6';
            }else if ("pqrs".indexOf(c) >= 0){
                keyPadArr[c] = '7';
            }else if ("tuv".indexOf(c) >= 0){
                keyPadArr[c] = '8';
            }else if ("wxyz".indexOf(c) >= 0){
                keyPadArr[c] = '9';
            }
        }

        for(char c : s.toCharArray()){
            sb.append(keyPadArr[c]+"");
        }

        System.out.println(sb);


    }
}
