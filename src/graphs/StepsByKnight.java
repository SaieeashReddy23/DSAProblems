package graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StepsByKnight {

    /*
    *
    *
    * Given a square chessboard, the initial position of Knight and position of a target. Find out the minimum steps a Knight
    *   will take to reach the target position.

        Note:
        The initial and the target position coordinates of Knight have been given according to 1-base indexing.
    *
    *
    *
    * idea :-
    *
    *       -> knight moves in L -way
    *       -> try to find if able to reach target pos;
    *
    *
    *
    *       o - you can move here
    *       1 - source
    *       2 - destination
    *
    * */

    public static class Cell{
        int x ;
        int y ;

        int dist;

        public Cell(int x , int y , int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }


    public static void run(int[] kPos, int[] tar, int n){

        int steps = minSteps(kPos , tar , n);

        if(steps == -1){
            System.out.println("Cant reach the target");
        }else{
            System.out.println( steps + " steps are needed to reach the target");
        }
    }

//    Bfs

    public static int minSteps(int[] kPos, int[] tar, int n){
//knight can move to almost 8 boxes
        int[] dx = {-1, -1 , 1 , 1,-2,-2 , 2 , 2};
        int[] dy = {2, -2, 2 , -2, -1 , 1 ,-1 , 1 };


        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n+1][n+1];

        queue.add(new Cell(kPos[0],kPos[1],0));
        visited[kPos[0]][kPos[1]] = true;

        while(!queue.isEmpty()){

            Cell cell = queue.poll();

            if(cell.x == tar[0] && cell.y == tar[1]){
                return cell.dist;
            }

            for(int i=0; i< 8 ; i++){

                int x = cell.x + dx[i];
                int y = cell.y + dy[i];


                if(isValid(x, y,n+1) && !visited[ x][y]){
                    visited[x][y] = true;
                    queue.add(new Cell(x,y , cell.dist+1));

                }
            }
        }


        return -1;

    }

    public static  boolean isValid(int x , int y , int n){
        if( x < 1 || x > n-1 || y < 1 || y > n-1){
            return false;
        }

        return true;
    }

}
