package com.sd.poly;

public class Circle extends Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "Circle " + super.toString();
	}
}