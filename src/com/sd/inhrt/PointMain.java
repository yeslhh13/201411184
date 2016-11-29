package com.sd.inhrt;

public class PointMain {
	public static void main(String[] args) {
		Circle c = new Circle(10, 10, 10.0);
		
		int x = c.getX();
		int y = c.getY();
		Double r = c.getR();
		Double rArea = c.getArea();
		
		System.out.println("Circle\nÁÂÇ¥: (" + x + ", " + y
				+ ")\n¹İÁö¸§: " + r + "\n³ĞÀÌ: " + rArea);
	}
}