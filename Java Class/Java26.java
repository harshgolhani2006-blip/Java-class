//Path tracker.
//class rat{
//    static  int n=4;
//    static boolean isSafe(int maze[][] ,int x,int y,boolean visited[][]){
//        return  x>=0 && x<n && y>=0 && y<n  && maze[x][y]==1 && !visited[x][y];
//
//    }
//
//    static  void solve(int maze[][],int x,int y,boolean  visited[][],String path){
//
//        if(x==n-1 && y==n-1){
//            System.out.println(path);
//            return;
//        }
//        visited[x][y]=true;
//        //down
//        if(isSafe(maze,x+1,y,visited)){
//            solve(maze, x+1, y, visited, path+"D");
//
//        }
//        //right
//        if(isSafe(maze,x,y+1,visited)){
//            solve(maze, x, y+1, visited, path+"R");
//
//        }
//        //left
//        if(isSafe(maze,x,y-1,visited)){
//            solve(maze, x, y-1, visited, path+"L");
//
//        }
//        if(isSafe(maze,x-1,y,visited)){
//            solve(maze, x-1, y, visited, path+"U");
//
//        }
//
//
//
//    }
//    public static void main(String[] args) {
//        int[][] maze = {
//                { 1, 0, 0, 0 },
//                { 1, 1, 0, 1 },
//                { 1, 1, 0, 0 },
//                { 1, 1, 1, 1 }
//                //DRDDRR
//        };
//        boolean visited[][]=new boolean[n][n];
//        if(maze[0][0]==1){
//            solve(maze,0,0,visited,"");
//        }
//
//
//    }
//}
// Multiple  Path tracker.
//class rat {
//    static int n = 4;
//
//    static boolean isSafe(int maze[][], int x, int y, boolean visited[][]) {
//        return x >= 0 && x < n && y >= 0 && y < n
//                && maze[x][y] == 1 && !visited[x][y];
//    }
//
//    static void solve(int maze[][], int x, int y, boolean visited[][], String path) {
//
//        // destination reached
//        if (x == n - 1 && y == n - 1) {
//            System.out.println(path);
//            return;
//        }
//
//        visited[x][y] = true;
//
//        // Down
//        if (isSafe(maze, x + 1, y, visited)) {
//            solve(maze, x + 1, y, visited, path + "D");
//        }
//
//        // Right
//        if (isSafe(maze, x, y + 1, visited)) {
//            solve(maze, x, y + 1, visited, path + "R");
//        }
//
//        // Left
//        if (isSafe(maze, x, y - 1, visited)) {
//            solve(maze, x, y - 1, visited, path + "L");
//        }
//
//        // Up
//        if (isSafe(maze, x - 1, y, visited)) {
//            solve(maze, x - 1, y, visited, path + "U");
//        }
//
//        // 🔁 BACKTRACK
//        visited[x][y] = false;
//    }
//
//    public static void main(String[] args) {
//        int[][] maze = {
//                {1, 0, 0, 0},
//                {1, 1, 0, 1},
//                {1, 1, 0, 0},
//                {1, 1, 1, 1}
//        };
//
//        boolean visited[][] = new boolean[n][n];
//
//        if (maze[0][0] == 1) {
//            solve(maze, 0, 0, visited, "");
//        }
//    }
//}
//Input user tracking path.
import java.util.Scanner;

class RatMaze {

    static int n;

    static boolean isSafe(int maze[][], int x, int y, boolean visited[][]) {
        return x >= 0 && x < n && y >= 0 && y < n
                && maze[x][y] == 1 && !visited[x][y];
    }

    static void solve(int maze[][], int x, int y, boolean visited[][], String path) {

        // Destination reached
        if (x == n - 1 && y == n - 1) {
            System.out.println(path);
            return;
        }

        visited[x][y] = true;

        // Down
        if (isSafe(maze, x + 1, y, visited)) {
            solve(maze, x + 1, y, visited, path + "D");
        }

        // Right
        if (isSafe(maze, x, y + 1, visited)) {
            solve(maze, x, y + 1, visited, path + "R");
        }

        // Left
        if (isSafe(maze, x, y - 1, visited)) {
            solve(maze, x, y - 1, visited, path + "L");
        }

        // Up
        if (isSafe(maze, x - 1, y, visited)) {
            solve(maze, x - 1, y, visited, path + "U");
        }

        // Backtracking
        visited[x][y] = false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maze size: ");
        n = sc.nextInt();

        int[][] maze = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        System.out.println("Enter maze elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        if (maze[0][0] == 1) {
            System.out.println("Possible Paths:");
            solve(maze, 0, 0, visited, "");
        } else {
            System.out.println("No path possible (start blocked)");
        }
    }
}

