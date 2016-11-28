package com.sd.inhrt;

public class Circle extends Point {
	private double r;
	
	public Circle(int x, int y, double r) {
		super(x, y);
		this.r = r;
	}
	
	public double getArea() {
		return r * r * Math.PI;
	}
	
	public double getR() {
		return r;
	}
}