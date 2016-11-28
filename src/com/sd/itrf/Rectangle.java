package com.sd.itrf;
//using interface
public class Rectangle implements Shape {
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