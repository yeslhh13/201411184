package com.sd.abst;
//using abstract class
public class Circle extends Shape {
	private double x, y, r;
	private double area;
	private double perimeter;
	
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public double calcArea() {
		area = Math.PI * r * r;
		return area;
	}
	
	@Override
	public double calcPerimeter() {
		perimeter = 2 * Math.PI * r;
		return perimeter;
	}
	
	public String toString() {
		return "Circle " + super.toString();
	}
}