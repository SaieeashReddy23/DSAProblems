package graphs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class RottenOranges {


    /*
    *
    * Given a grid of dimension nxm where each cell in the grid can have values 0, 1 or 2 which has the following meaning:
        0 : Empty cell
        1 : Cells have fresh oranges
        2 : Cells have rotten oranges

        We have to determine what is the earliest time after which all the oranges are rotten.
      * A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time.
    *
    *
    *
    *
    * Idea :-
    *
    *       -> Do bfs ,
    *       -> add all rotten oranges places to queue and add a delimiter
    *       -> now till queue is empty
    *
    *               -> have a flag which checks if any fresh orange exists and it gets rotten in current time frame , till we reach elimiter
    *               -> now iterate till you reach delimiter
    *
    *                       -> for any indexes in its sides change or rot the value and add to queue.
    *
    * */


    public static class Element{
        int x;
        int y;

        public Element(int x , int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void run(int[][] grid){

        System.out.println("Time taken to rot all is " + timeToRot(grid));

    }

    public static int timeToRot(int[][] grid){

        Queue<Element> queue = new LinkedList<>();

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i< m ; i++){
            for(int j=0; j<n ; j++){
                if(grid[i][j] == 2){
                    queue.add(new Element(i , j));
                }
            }
        }

//        Delimiter
        queue.add(new Element(-1  ,-1));

        int ans = 0;

        while(!queue.isEmpty()){

            boolean flag = false;

            while(queue.peek() != null && !isDelimiter(queue.peek()) ){

                Element element = queue.poll();
                int x = element.x;
                int y = element.y;


//              up
                if(isValid(x+1,y,m ,n) && grid[x+1][y] == 1){
                    if(!flag){
                        ans++;
                        flag = true;
                    }
                    grid[x+1][y] = 2;
                    queue.add( new Element(x+1, y));
                }

//              Down
                if(isValid(x-1,y,m ,n) && grid[x-1][y] == 1){

                    if(!flag){
                        ans++;
                        flag = true;
                    }

                    grid[x-1][y] = 2;
                    queue.add( new Element(x-1, y));

                }

//              right
                if(isValid(x,y+1,m ,n) && grid[x][y+1] == 1){

                    if(!flag){
                        ans++;
                        flag = true;
                    }

                    grid[x][y+1] = 2;
                    queue.add( new Element(x, y+1));

                }

//              left
                if(isValid(x,y-1,m ,n) && grid[x][y-1] == 1){

                    if(!flag){
                        ans++;
                        flag = true;
                    }

                    grid[x][y-1] = 2;
                    queue.add( new Element(x, y-1));

                }

            }

            queue.poll();

            if(!queue.isEmpty()){
                queue.add(new Element(-1,-1));
            }
        }


        if(isCleanPresent(grid)){
            return  -1;
        }


        return ans;

    }


    public static boolean isDelimiter(Element element){
        if(element.x == -1 && element.y == -1){
            return true;
        }

        return false;
    }

    public static boolean isValid(int x, int y,int m , int n){

        if(x < 0 || x > m-1 || y < 0 || y > n-1  ){
            return false;
        }

        return true;
    }

    public static boolean isCleanPresent(int[][] grid){


        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i< m ; i++){
            for(int j=0; j<n ; j++){
                if(grid[i][j] == 1){
                    return true;
                }
            }
        }

        return false;

    }


}
