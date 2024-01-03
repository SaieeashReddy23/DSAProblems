package Matrix;

public class BooleanMatrix {

    /*
    *
    * Given a boolean matrix of size RxC where each cell contains either 0 or 1,
    *  modify it such that if a matrix cell matrix[i][j] is 1 then all the cells
    * in its ith row and jth column will become 1.
    *
    * */
    public static void run(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        int[] rows = new int[n];
        int[] cols = new int[m];


        for(int i=0; i< n ; i++){
            for(int j=0; j < m ; j++){
                if(arr[i][j] == 1){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }


        for(int i=0; i< n ; i++){
            for(int j=0; j < m ; j++){
                if(rows[i] == 1 || cols[j] == 1){
                    arr[i][j] = 1;
                }
            }
        }



    }
}
