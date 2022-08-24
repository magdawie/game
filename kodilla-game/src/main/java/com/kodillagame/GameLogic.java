package com.kodillagame;

public class GameLogic {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.print();
        System.out.println();
        GameMechanic gameMechanic = new GameMechanic(gameBoard);
        gameMechanic.field(0,0, 'X');
        gameBoard.print();
    }

}
