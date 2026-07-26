package com.code-review;

public class CRTest {

  private static String VARIABLE = 123L;

  public static void main(String[] args) {
    Game game = new Game();  
    game.play();
    game.move(1, 2);
    win();
  }

    public static void win() {
      System.out.println("User 1 won!");
    }

  public static class Game {    
    
    public void play(){
      System.out.println("Game started");
    }

    public void move(int x, int y) {
      System.out.println("User made move to x:" + x + " y:" + y);
    }
  }
  
}
