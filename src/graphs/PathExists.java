package graphs;

public class PathExists {



    public static void run(int[][] grid){

        if(isPathExists(grid)){
            System.out.println("yes there is a path that exists bwteen source and destination");
        }else{
            System.out.println("No path exists");
        }


    }

    public static boolean isPathExists(int[][] grid){

        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for(int i=0; i< m ; i++){
            for(int j=0; j< n ; j++){
                if(grid[i][j] == 1){
                    if(dfs(grid , i , j, visited)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean dfs(int[][] grid , int i , int j , boolean[][] visited) {

        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || i > m-1  || j < 0 || j > n-1 ){
            return false;
        }


        if(grid[i][j] == 0){
            return false;
        }

        if(grid[i][j] == 2){
            return true;
        }

        boolean isReachable = false;

        if(!visited[i][j]){
            visited[i][j] = true;
            isReachable = dfs(grid , i-1 , j, visited) || dfs(grid , i+1 , j,visited) || dfs(grid , i , j-1,visited) || dfs(grid , i , j+1,visited);
        }



        return isReachable ;

    }

}
