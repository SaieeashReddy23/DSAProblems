package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RearrangeCharacters {

    /*
    *
    * Given a string S such that it may contain repeated lowercase alphabets.
    * Rearrange the characters in the string such that no two adjacent characters are same.
    *
    * Idea :-
    *   -> Use a priority queue store character and its freqencey , priority should be based on character freq
    *   -> remove one by one and also keep track of prev one with its reduced freq  , if prev one having freq > 0 then again add it to queue
    *
    *
    * */


    static class Pair{
        int freq;
        char letter;

        public Pair(char letter , int freq){
            this.letter = letter;
            this.freq = freq;
        }
    }



    public static void run(String s){

        int[] count = new int[26];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.freq - a.freq);

        for(int i=0; i< s.length();i++){
            char c = s.charAt(i);
            count[c-'a']++;
        }

        for(int i=0; i< 26; i++){
            if(count[i] > 0){
                pq.add(new Pair((char) (i + 'a'),count[i]));
            }
        }

        StringBuilder res = new StringBuilder();

        Pair prev = new Pair('#',-1);

        while(!pq.isEmpty()){
            Pair p = pq.poll();

            res.append(p.letter);

            if(prev.freq > 0){
                pq.add(prev);
            }

            p.freq--;
            prev = p;
        }

        if(res.toString().length() != s.length()){
            System.out.println("It is not possible");
        }else{
            System.out.println(res.toString());
        }






    }

}
