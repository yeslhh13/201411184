package com.sd.abst;
//using abstract class
public class Rectangle extends Shape {
	private double width, height;
	private double area;
	private double perimeter;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		area = width * height;
		return area;
	}
	
	@Override
	public double calcPerimeter() {
		perimeter = 2 * (width + height);
		return perimeter;
	}
}