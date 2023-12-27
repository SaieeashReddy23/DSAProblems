package sorting;

public class CountInversionsInArray {

//    INversion means , i < j , but arr[i] > arr[j]

//    We will do this using merge sort technnique in that we will add few more lines

//    Time complexity O(nlogn)


    public static void run(int[] arr){

        System.out.println(mergeSort(arr , 0 , arr.length-1));
    }

    public static int mergeSort(int[] arr , int l , int r){
        int res = 0;
        if( l < r){
            int mid = l + (r-l)/2;
            res += mergeSort(arr , l ,mid);
            res += mergeSort(arr , mid+1 , r);
            res += CountAndmerge(arr , l , mid , r);
        }

        return res;

    }

    public static int CountAndmerge(int[] arr , int l ,int mid ,  int r){

        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0 ; i < n1; i++){
            left[i] = arr[l+i];
        }

        for(int i=0 ; i < n2; i++){
            right[i] = arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=l;
        int res= 0;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }else{
                arr[k] = right[j];
                j++;
                k++;
                res += n1-i;
            }
        }

        while(i< n1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while( j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

}
