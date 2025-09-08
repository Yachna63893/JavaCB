package Recursion;
import java.util.*;

public class Rat_Chases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i=0; i<maze.length; i++){
            String s = sc.next();
            for(int j=0; j<s.length(); j++){
                maze[i][j] = s.charAt(j);
            }
        }
        sc.close();
        int[][] ans = new int[n][m];
        Maze_Path(maze, 0, 0, ans);
        if(val==false){
            System.out.println("NO PATH FOUND");
        }
    }
    static boolean val = false;
    public static void Maze_Path(char[][] maze, int cr, int cc, int[][] ans){
        if(cc<0 || cr<0 ||  cc>=maze[0].length || cr>=maze.length || maze[cr][cc]=='X'){
            return;
        }
        if(cr==maze.length-1 && cc==maze[0].length-1){
            ans[cr][cc] = 1;
            Display(ans);
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        int[] r = {-1,0,1,0};
        int[] c = {0,-1,0,1};
        for(int i=0; i<c.length; i++){
            Maze_Path(maze, cr+r[i], cc+c[i], ans);
        }
        // Maze_Path(maze, cr-1, cc,ans); //up
        // Maze_Path(maze, cr, cc-1,ans); //left
        // Maze_Path(maze, cr+1, cc,ans);//down
        // Maze_Path(maze, cr, cc+1,ans);//right
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0;
    }
    public static void Display(int[][] ans){
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(); 
        }
    }
}
