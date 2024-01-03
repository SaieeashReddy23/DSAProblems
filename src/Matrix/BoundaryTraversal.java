package Matrix;

public class BoundaryTraversal {

    public static void run(int[][] arr){

        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1){
            for(int i=0; i< cols ; i++){
                System.out.print(arr[0][i] + " ");
            }
        }else if (cols == 1){
            for(int i=0; i< rows ; i++){
                System.out.print(arr[i][0] + " ");
            }
        }else {
            for(int i=0 ; i< cols; i++ ){
                System.out.print(arr[0][i] + " ");
            }

            for(int i=1 ; i< rows; i++ ){
                System.out.print(arr[i][cols-1] + " ");
            }
            for(int i=cols-2 ; i>=0; i-- ){
                System.out.print(arr[rows-1][i] + " ");
            }
            for(int i=rows-2 ; i> 0; i-- ){
                System.out.print(arr[i][0] + " ");
            }

        }





    }
}
