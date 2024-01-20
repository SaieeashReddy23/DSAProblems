package Strings;

import java.util.Arrays;

public class CaseSpecificSortingOfStrings {

    public static void run(String str){
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[256];

        for(char c : str.toCharArray()){
            arr[c]++;
        }

        int i='A';
        int j ='a';

        for(int k=0; k < str.length();k++){
            char c = str.charAt(k);
            if(c >='A' && c <='Z'){
                while(i <='Z' && arr[i] == 0){
                    i++;
                }

                sb.append((char)i);

                if(arr[i] > 0){
                    arr[i]--;
                }else{
                    i++;
                }

            }else{
                while( j <= 'z' && arr[j] == 0){
                    j++;
                }
                sb.append((char)j);
                if(arr[j] > 0){
                    arr[j]--;
                }else{
                    j++;
                }
            }
        }

        String s = "";
        Arrays.sort(s.toCharArray());

        System.out.println(sb);
    }
}
