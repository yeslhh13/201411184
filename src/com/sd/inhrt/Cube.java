package com.sd.inhrt;

public class Cube extends Rectangle {
	double height;
	
	public Cube(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
}