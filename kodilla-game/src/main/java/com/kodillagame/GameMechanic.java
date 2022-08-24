package com.kodillagame;

public class GameMechanic {

    GameBoard gameBoard;
    public GameMechanic(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }
    public void field(int x, int y, char sign){
        if(gameBoard.getField(x, y)== ' '){
            gameBoard.setField(sign, x, y);
        }else{
            System.out.println(" Błąd"); // dodac wyjatek
        }
    }



}
