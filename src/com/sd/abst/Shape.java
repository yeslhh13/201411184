package com.sd.itrf;

public abstract class Shape {
	public String name = "Shape";
	public abstract double calcArea();
	public abstract double calcPerimeter();
	public String getName() {
		return name;
	}
	public String toString() {
		return "Shape..." + super.toString();
	}
}