package algorithms;


/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
        import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


public class NQSolution {

    final int N=4;

    boolean isSafe(int [][] board, int row, int col){
        int i,j;
        //check left row
        for(i=0;i<col;i++){
            if(board[row][i]==1)
                return false;
        }
        //check diagonal upper left
        for(i=row,j=col;j>=0 && i>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        //check lower left diagonal
        for(i=row,j=col;j>=0 && i<N;i++,j--){
            if(board[i][j]==1)
                return false;
        }

        return true;
    }

    boolean solveNQUtil(int [][] board,int col){

        if(col>=N){
            return true;
        }

        for(int i=0;i<N;i++){
            if(isSafe(board,i,col)){
                //place queen here
                board[i][col]=1;
                //check other positions of queen
                if(solveNQUtil(board,col+1)){
                    return true;
                }
                //no solution remove queen. backtrack
                board[i][col]=0;

            }
        }
        return false;
    }


    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    boolean solveNQ(){
        int board[][]= {{0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0} } ;

        if(solveNQUtil(board,0)==false){
            System.out.println("solution doesnt exist");
            return false;
        }

        printSolution(board);
        return false;
    }


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        NQSolution sol= new NQSolution();
        sol.solveNQ();
    }
}

