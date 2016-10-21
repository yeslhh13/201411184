package com.sd.dicegame;

class Dice {
  private int number = 0;
  public int rollDice() {
    this.number = (int) (Math.random() * 6) + 1;
    System.out.println("Turn on " + number);
    return this.number;
  }
}
