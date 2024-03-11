package graphs;

public class NoOfIslands {


    /*
    *
    * Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid)
    * consisting of '0's (Water) and '1's(Land) . Find the number of islands.
    * Note: An island is either surrounded by water or boundary of grid and is formed by connecting adjacent lands
    *  horizontally or vertically or diagonally i.e., in all 8 directions.
    *
    *
    *
    * */


    public static void run(int[][] grid){

        System.out.println("No of islands is : " + islands(grid));
    }


    public static int islands(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int count = 0;
        for(int i=0; i< m ; i++){
            for(int j=0; j< n ; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    dfs(grid , i , j , visited);
                    count++;
                }
            }
        }

        return  count;
    }

    public static void dfs(int[][] grid , int i , int j , boolean[][] visited){
        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || i > m-1 || j <0 || j > n-1 ){
            return;
        }

        if(grid[i][j] == 1 && !visited[i][j]){
            visited[i][j] = true;

            dfs(grid , i-1 , j , visited);
            dfs(grid , i+1 , j , visited);
            dfs(grid , i , j-1 , visited);
            dfs(grid , i , j+1 , visited);
            dfs(grid , i+1 , j+1 , visited);
            dfs(grid , i-1 , j-1 , visited);
            dfs(grid , i+1 , j-1 , visited);
            dfs(grid , i-1 , j+1 , visited);
        }


    }

}
