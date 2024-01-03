package Matrix;

public class SpiralTraversalOfMatrix {

//    Time complexity Theta(R*C)
    public static void run(int[][] arr){

        printMatrix(arr);

        int top = 0;
        int left = 0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;

        while(left <= right && top <= bottom){
            for(int i = left; i<= right ; i++ ){
                System.out.print(arr[top][i] + "  ");
            }

            top++;

            for(int i = top ; i <= bottom ;i++){
                System.out.print(arr[i][right] + "  ");
            }

            right--;

            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                    System.out.print(arr[bottom][i] + "  ");
                }

                bottom--;

            }

            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    System.out.print(arr[i][left] + "  ");
                }

                left++;
            }




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
