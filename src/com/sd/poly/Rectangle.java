package com.sd.poly;

public class Rectangle extends Shape {
	private double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle " + super.toString();
	}
}