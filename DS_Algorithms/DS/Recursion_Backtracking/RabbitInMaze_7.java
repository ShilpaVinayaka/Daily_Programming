package Recursion_Backtracking;

public class RabbitInMaze_7 {

    static int N;

    public static void printSolution(int sol[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                    " " + sol[i][j] + " ");
            System.out.println();
        }
    }

    //Check if x,y is valid index for maze
    public static boolean isSafe(int maze[][], int x, int y) {
        return (x>=0 && x<N && y>=0 && y< N && maze[x][y] == 1);
    }

    public static boolean solveMaze(int maze[][]) {
        int sol[][] = new int[N][N];

        if(solveMazeUntil(maze, 0, 0, sol) == false) {
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;

    }

    public static boolean solveMazeUntil(int maze[][], int x, int y, int sol[][]) {

        //If (x,y is goal) return true
        if(x==N-1 && y == N-1 && maze[x][y] == 1 ) {
            sol[x][y] = 1;
            return true;
        } 

        if(isSafe(maze, x, y) == true) {

            if(sol[x][y] == 1)
                return false;

            sol[x][y] = 1;

            //Move in x direction
            if(solveMazeUntil(maze, x+1, y, sol) == true)
                return true;

            // if(solveMazeUntil(maze, x-1, y, sol) == true)
            //     return true;

            //If moving in x direction doesn't give solution
            // Move in y direction
            if(solveMazeUntil(maze, x, y+1, sol) == true)
                return true;

            // if(solveMazeUntil(maze, x, y-1, sol) == true)
            //     return true;

            //If none of the above movements works then BACKTRACK: 
            // unmark x,y as part of solution path
            sol[x][y] = 0;
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
  
        N = maze.length;
        solveMaze(maze);
    }
}
