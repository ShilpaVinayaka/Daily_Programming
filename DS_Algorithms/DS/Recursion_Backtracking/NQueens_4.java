package Recursion_Backtracking;
import java.util.*;

public class NQueens_4 {

    public static boolean isSafe(int row, int col, char[][] board) {

        //Checking horizontally
        for(int j=0; j<board.length; j++) {
            //if Queen is already in the row
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        //Vertically
        for(int i=0; i<board[0].length; i++) {
            //if Queen is already in the column
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //Upperleft
        int r = row;
        for(int c = col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //Upperright
        r=row;
        for(int c = col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //Lowerleft
        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //LowerRight
        for(int c=col; c<board.length && r<board.length; r++, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;         
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";

        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++) {
            row = "";
            for(int j = 0; j<board[0].length; j++) {
                if(board[i][j] == 'Q' ) 
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }



    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if(col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        //Placing Queen - moving from one row after the another to find safe place
        for(int row = 0; row<board.length; row++) {

            //check if the row place is safe
            if(isSafe(row, col, board)) {
                //If it is safe place the Queen
                board[row][col] = 'Q';

                //to place next queen in next column
                helper(board, allBoards, col+1);

                //if the Queen placed is wrong
                board[row][col] = '-';
            }
        }

    } 

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();

        //chessboard
        char[][] board = new char[n][n];

        //recursive function - for backtracking
        helper(board, allBoards, 0);

        return allBoards;
    }

    public static void main(String[] args) {
        
        System.out.println(solveNQueens(4));
    }
}
