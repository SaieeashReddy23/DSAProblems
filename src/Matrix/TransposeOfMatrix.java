package Matrix;

public class TransposeOfMatrix {

//    Swap upper diagonal element with lower diagonal elements
    public static void run(int[][] arr){

        int rows = arr.length;
        int cols = arr[0].length;

        printMatrix(arr);

        System.out.println();
        System.out.println();

        for(int i = 0 ; i < rows; i++){
            for(int j=i+1; j < cols ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        printMatrix(arr);

    }

    public static void printMatrix(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
