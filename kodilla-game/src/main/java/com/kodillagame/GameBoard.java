package com.kodillagame;

public class GameBoard {

    private char[][] board = new char[3][3];

    public GameBoard() {

        for(int x = 0; x <3; x++){
            for(int y = 0; y < 3; y++) {
                board[x][y]= ' ';
            }
        }
    }

    public char getField(int x, int y) {
        return board[x][y];
    }

    public void setField(char sign, int x, int y) {
        board[x][y] = sign;
    }

    public void print() {
        System.out.println("     0  1  2");
        for(int x = 0; x <3; x++){
            System.out.println();
            System.out.print(x + ": ");
            System.out.print("|");

            for(int y = 0; y < 3; y++){
                System.out.print(board[x][y] + " |");
            }
        }
        System.out.println();
    }

}
