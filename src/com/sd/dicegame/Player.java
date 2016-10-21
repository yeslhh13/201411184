package com.sd.dicegame;

class Player {
  private String name = null;
  private int number = 0;
  public Player(String name) {
    this.name = name;
  }
  public void play() {
    Dice d = new Dice();
    System.out.print("Player " + this.name + "'s turn: ");
    number = d.rollDice();
  }
  public int getNum() {
	return this.number;
  }
  public String getName() {
	return this.name;
  }
}
