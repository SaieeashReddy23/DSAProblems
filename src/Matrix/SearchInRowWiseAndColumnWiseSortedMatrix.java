package Matrix;

public class SearchInRowWiseAndColumnWiseSortedMatrix {

    /*
    * Based on the sorted rows and columns fact
    *
    *  we move from top right pos , if x grater than that pos values then move down , else move left
    *
    *
    * We can choose either top right corner or bottom left corner. Other two corners we cant becoz we
    *  cant eleiminate any row or column , there will be ambiguity
    *
    *
    * TimeCOmplexity - O(R+C)
    *
    *
    *
    * */
    public static void run(int[][] arr , int x){



        int i = 0;
        int j = arr[i].length-1;


        while(i <= arr.length-1 && j >=0 ){

            if(arr[i][j] == x){
                System.out.println(String.format("%d is found at pos row : %d  and col : %d" , x , i , j ));
                return;
            }else if (arr[i][j] > x){
                j--;
            }else{
                i++;
            }
        }

        System.out.println(String.format("%d is not found in the matrix", x));

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
