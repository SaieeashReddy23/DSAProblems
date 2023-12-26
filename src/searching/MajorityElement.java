package searching;

public class MajorityElement {

//    An element is called majority element if it occures more than n/2 times , where n is the length of array.

//    We can use 2 step approach , find candidate and then check candidate

//    this is popularly called moores voting algorithm
    public static void run(int[] arr){
        int res = findCandidate(arr);

        if(isMajority(arr , res)){
            System.out.println("Majority exists");
        }else{
            System.out.println("Majority doesnot exist");
        }

    }

    public static int findCandidate(int[] arr){

        int res = 0;
        int count = 1;

        for(int i=1; i < arr.length;i++){
            if(arr[i] == arr[res]){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                res = i;
                count = 1;
            }
        }

        return res;
    }

    public static boolean isMajority(int[] arr , int res){

        int count = 0;
        for(int i=0; i< arr.length;i++){
            if(arr[i] == arr[res]){
                count++;
            }

        }

        if(count > arr.length/2){
            return true;
        }

        return  false;

    }

}
