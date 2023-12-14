package recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class PossibleWodsFromPhoneDigit {

    public static HashMap<Integer , String> map ;
    public static ArrayList<String> arr;

    static {
        map = new HashMap<>();
        map.put(2 , "abc");
        map.put(3 , "def");
        map.put(4, "ghi");
        map.put(5 , "jkl");
        map.put(6, "mno");
        map.put(7 , "pqrs");
        map.put(8 , "tuv");
        map.put(9 , "wxyz");
        arr = new ArrayList<>();
    }

    public static void run(int[] a ){
        possibleWords(0 , "" , a);
        System.out.println(arr);
    }

    public static void possibleWords(int pos , String curr , int[] a ){
        if(pos == a.length){
            arr.add(curr);
            return;
        }

        int clickedNumber = a[pos];
        String clickedNumberAlphabetString = map.get(clickedNumber);

        for(int i=0 ; i < clickedNumberAlphabetString.length() ; i++){
            possibleWords(pos + 1 , curr + clickedNumberAlphabetString.charAt(i) , a);
        }

    }



}
