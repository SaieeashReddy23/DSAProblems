package arrays;

import java.util.Arrays;

public class MaxAppearingElementInRanges {

//    This is a quadratic time complexity solution O(n*max) , find the linear time complexity solution
    public static void run(int[] left , int[] right){

        int[] count = new int[100+1];

        for(int i=0;i<left.length;i++){
            for(int j = left[i] ; j <= right[i] ; j++){
                count[j]++;
            }
        }

        System.out.println(Arrays.toString(count));

        int maxCount = 0;

        for(int i=0 ; i< 100+1 ; i++){

            if(count[i] > count[maxCount]){
                maxCount = i;
            }

        }

        System.out.println("Most occuring element is " + maxCount);

    }


    /*
    * Linear efficient solution
    *
    * place in freq array left starting range with 1 and right with -1
    *
    * do prefix of this array what it does is gives count of each element.
    *
    * Timecomplexity O(n + max)
    *
    * */

    public static void effSol(int[] left , int[] right){
        int[] freq = new int[100+1];
        int[] prefix = new int[100+1];

        for(int i=0;i<left.length;i++){
            freq[left[i]]++;
            freq[right[i] + 1]--;
        }

        int sum = freq[0];
        for(int i=0;i < 101 ;i ++){
            sum = sum + freq[i];
            prefix[i] = sum;
        }


        int res = 0;
        for(int i=0;i < 101 ;i ++){
            if(prefix[res] < prefix[i]){
                res =i;
            }
        }

        System.out.println(res);

    }

}
