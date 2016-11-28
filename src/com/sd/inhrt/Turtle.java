package com.sd.inhrt;

public class Turtle {
	private int nLimbs = 4;
	protected String food;
	
	public void setFood(String food) {
		this.food = food;
	}
	public void eat() {
		System.out.println("eating " + food + "...");
	}
	public int getLimbs() {
		return nLimbs;
	}
}