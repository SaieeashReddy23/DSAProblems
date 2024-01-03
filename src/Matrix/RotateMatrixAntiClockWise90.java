package Matrix;

public class RotateMatrixAntiClockWise90 {

    public static void run(int[][] arr){

        printMatrix(arr);

        for(int i=0; i< arr.length;i++){
            revRow(arr , i);
        }

        printMatrix(arr);

        for(int i=0 ; i< arr.length; i++){
            for(int j=i+1; j < arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        printMatrix(arr);



    }

    public static void revRow(int[][] arr , int row){
        int r = arr[row].length - 1;
        int l=0;
        while(l <= r){
            int temp = arr[row][l];
            arr[row][l] = arr[row][r];
            arr[row][r] = temp;
            l++;
            r--;
        }
    }





    public static void printMatrix(int[][] arr){
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*************************************");
        System.out.println();
    }
}
