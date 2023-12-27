package sorting;

public class IntersectionOfTwoSortedArrays {


//    Time complexity O(m+n)  -  similar to the one in merge sort , should not print repeated elements

    public static void run(int[] arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;


        int i = 0;
        int j = 0;

        while(i < n1 && j < n2){
            if(i>0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }

            if(arr1[i] > arr2[j]){
                j++;

            }else if (arr1[i] < arr2[j]){
                i++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }
}
