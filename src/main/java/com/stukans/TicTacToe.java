package com.stukans;

public class TicTacToe {

  public static void main(String[] args) {
    Game game = new Game();  
    game.play();
  }

  private static void move(int x, int y) {
    System.out.println("User made move to x:" + x + " y:" + y);
  }

  private static void win() {
    System.out.println("User 1 won!")
  }

  public static class Game {

    public void play(){
      System.out.println("Game started");
    }
    
  }
  
}
