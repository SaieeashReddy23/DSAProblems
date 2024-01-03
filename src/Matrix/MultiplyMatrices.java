package Matrix;

public class MultiplyMatrices {
    public static void run(int[][] A , int[][] B){

        int n1 = A.length;
        int m1 = A[0].length;


        int n2 = B.length;
        int m2 = B[0].length;



        if(m1 != n2){
            System.out.println("Not possible");
            return;
        }

        int[][] res = new int[n1][m2];

        for(int i=0; i<n1 ; i++ ){
            for(int j=0 ; j < m2; j++){
                int temp = 0;
                for(int k=0 ; k< m1; k++){
                    temp += A[i][k]*B[k][j];
                }

                res[i][j] = temp;
            }
        }

        printMatrix(res);

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
