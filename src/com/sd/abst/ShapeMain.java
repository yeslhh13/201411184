package com.sd.abst;

public class ShapeMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10.0, 20.0);
		Double rArea = r.calcArea();
		Double rPeri = r.calcPerimeter();
		System.out.println("area: " + rArea + "\nperimeter: " + rPeri
				+ "\n" + r.toString());
				
		Circle c = new Circle(10.0, 10.0, 15.0);
		Double cArea = c.calcArea();
		Double cPeri = c.calcPerimeter();
		System.out.println("area: " + cArea + "\nperimeter: " + cPeri
				+ "\n" + c.toString());
	}
}