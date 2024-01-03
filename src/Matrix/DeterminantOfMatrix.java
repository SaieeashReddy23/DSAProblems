package Matrix;

public class DeterminantOfMatrix {

    public static void run(int[][] arr){

        printMatrix(arr);
        System.out.println(det(arr));

    }

    public static int det(int[][] arr){
        int n = arr.length;
        if(n == 1){
            return arr[0][0];
        }

        int res = 0;

        // traverse through first row cols
        for(int i=0 ; i < n ; i++){

            int[][] temp = new int[n-1][n-1];

            // traverse rows to form second matrix
            for(int j=1; j< n ; j++){
                int x = 0;

                // traverse cols to form second matrix
                for(int k=0; k < n ; k++){
                    if(k==i){
                        continue;
                    }

                    temp[j-1][x++]  = arr[j][k];
                }
            }

            res += arr[0][i]*det(temp)*(i%2==0 ? 1 : -1 );
        }

        return res;
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
