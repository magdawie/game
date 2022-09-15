package com.kodillagame;

import java.util.Scanner;

public class GameLogic {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        GameMechanic gameMechanic =new GameMechanic(gameBoard);
        gameBoard.print();

        char actual = 'X';

        GameState gameState = GameState.RUN;
        Scanner sc = new Scanner(System.in);

        while (gameState == GameState.RUN) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            boolean move = true;
            try {
                gameMechanic.setField(x, y, actual);
            } catch (WrongPlaceException e) {
                System.out.print("Wrong field try again!");
                move = false;
            }
            if(move){
                if(actual == 'O') {
                    actual = 'X';
                }else{
                    actual = 'O';
                }
            }

            gameBoard.print();
            gameState = gameMechanic.gameStatus();
        }

        if (gameState == GameState.WIN_X) {
            System.out.println("Win X");
        } else if (gameState == GameState.WIN_O) {
            System.out.println("Win O");
        } else {
            System.out.println("No win");
        }
    }


}
