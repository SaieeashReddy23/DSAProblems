package arrays;

import java.util.Arrays;

public class EquilibriumPoint {

//   a point is called equilibirum point if sum of elements before is euqal to sum of all elements after it


//    Exercise problem , divide an array into 3 equal parts such that each part sum is same
    public static void run(int[] arr){

        boolean isEquilibriumExists = false;
        int[] prefix = new int[arr.length];
        int[] postfix = new int[arr.length];

        prefix[0] = arr[0];
        postfix[arr.length-1] = arr[arr.length-1];

        for(int i=1;i< arr.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=arr.length-2;i>=0 ; i--){
            postfix[i] = postfix[i+1] + arr[i];
        }

        if(postfix[1] == 0){
            isEquilibriumExists = true;
        }

        if(prefix[arr.length-2] == 0){
            isEquilibriumExists = true;
        }

        for(int i=1 ; i<arr.length-1 ; i++){
            if(prefix[i-1] == postfix[i+1]){
                isEquilibriumExists = true;
            }
        }


        if(isEquilibriumExists){
            System.out.println("Exquilibrium point exists");
        }
    }

    public static void threeEqualSplits(int[] arr){

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        if(sum %3 != 0){
            System.out.println("Can't ne splitted into 3 equal pats");
            return;
        }

        int s1Index = -1;
        int s2Index = -1;

        int s1 = sum/3;
        int s2 = 2*s1;

        int presum = 0;

        System.out.println("Total sum " + sum);
        System.out.println("S1 : " + s1);
        System.out.println("s2 : " + s2);

        for(int i=0;i<arr.length-1;i++){

            presum = presum + arr[i];
            System.out.println("Each presum " + presum);

            if(presum == s1 &&  s1Index == -1){
                System.out.println("s1 will be setted");
                s1Index = i;
            }else if(presum == s2 && s1Index != -1){
                s2Index = i;
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(s1Index);
        System.out.println(s2Index);

    }
}
