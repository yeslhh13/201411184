package com.sd.inhrt;

public class SelectMain {
	public static void main(String[] args) {
		Selection s = new Selection();
		Rectangle r = new Rectangle(20.0, 30.0);
		Rectangle c = new Cube(10.0, 20.0, 30.0);
		
		s.select(r);
		s.select(c);
		
		r.getSelected();
		c.getSelected();
		
		s.print();
	}
}