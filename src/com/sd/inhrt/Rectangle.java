package com.sd.inhrt;

public class Rectangle {
	protected double length;
	protected double width;
	boolean isSelected;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setSelected(boolean b) {
		this.isSelected = b;
	}
	
	public boolean getSelected() {
		return this.isSelected;
	}
}