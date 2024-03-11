package graphs;

public class LargestAreaOfOne {

    public static class Sol{
        int area;
        public Sol(int area){
            this.area = area;
        }
    }


    public static void run(int[][] grid){

        System.out.println("max area of 1 is : " + findMaxArea(grid));
    }

    public static int findMaxArea(int[][] grid){
        // Code here

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int max = 0;

        for(int i=0; i< m ; i++){
            for(int j=0; j < n ; j++){
                if(grid[i][j] == 1 && !visited[i][j]){

                    Sol sol = new Sol(0);

                    dfs(grid , i , j , visited , sol);

                    max = Math.max(max , sol.area);
                }
            }
        }

        return max;
    }

    public static void dfs(int[][] grid , int i , int j , boolean[][] visited,  Sol sol ){

        int m = grid.length;
        int n = grid[0].length;

        if( i < 0 || i > m-1 || j < 0 || j > n-1 ){
            return;
        }


        if(grid[i][j] == 1 && !visited[i][j]){
            visited[i][j] = true;
            sol.area++;

            dfs(grid , i-1 , j , visited ,  sol);
            dfs(grid , i+1 , j , visited ,  sol);
            dfs(grid , i , j-1 , visited ,   sol);
            dfs(grid , i , j+1 , visited ,   sol);
            dfs(grid , i+1 , j+1 , visited, sol);
            dfs(grid , i-1 , j-1 , visited, sol);
            dfs(grid , i+1 , j-1 , visited, sol);
            dfs(grid , i-1 , j+1 , visited, sol);

        }


    }
}
