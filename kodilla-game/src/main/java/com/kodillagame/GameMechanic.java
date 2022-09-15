package com.kodillagame;

public class GameMechanic {

    GameBoard gameBoard;
    public GameMechanic(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }
    public void setField(int x, int y, char sign) throws WrongPlaceException {
        if(x <3 && y <3) {
            if (gameBoard.getField(x, y) == ' ') {
                gameBoard.setField(sign, x, y);
            } else {
                throw new WrongPlaceException(" Error!!!");
            }
        }else {
            throw new WrongPlaceException(" Error!!!");
        }
    }
   public GameState gameStatus() {
       boolean availableSpace = false;

       boolean win = false;
       char winPlayer = ' ';

       char same;

       for (int x = 0; x < 3; x++) {
          same = gameBoard.getField(0,x);
          if (same == ' ') continue;
          else {
              if (gameBoard.getField(1,x) == same) {
                  if (gameBoard.getField(2, x) == same) {
                      win = true;
                      winPlayer = same;
                  }
              }
          }
       }

       for (int x = 0; x < 3; x++) {
           same = gameBoard.getField(x,0);
           if (same == ' ') continue;
           else {
               if (gameBoard.getField(x,1) == same) {
                   if (gameBoard.getField(x, 2) == same) {
                       win = true;
                       winPlayer = same;
                   }
               }
           }
       }

       same = gameBoard.getField(0,0);
       if (same != ' ') {
           if (gameBoard.getField(1, 1) == same) {
               if (gameBoard.getField(2, 2) == same) {
                   win = true;
                   winPlayer = same;
               }
           }
       }

       same = gameBoard.getField(2,0);
       if (same != ' ') {
           if (gameBoard.getField(1, 1) == same) {
               if (gameBoard.getField(0, 2) == same) {
                   win = true;
                   winPlayer = same;
               }
           }
       }

       for (int x = 0; x < 3; x++) {
           for (int y = 0; y < 3; y++) {
               if(gameBoard.getField(x,y) == ' ') {
                   availableSpace = true;
               }
           }
       }

       if (win) {
           if (winPlayer == 'X') {
               return GameState.WIN_X;
           } else {
               return GameState.WIN_O;
           }
       } else if (!availableSpace) {
           return GameState.NO_SPACE;
       }

       return GameState.RUN;
   }



}
