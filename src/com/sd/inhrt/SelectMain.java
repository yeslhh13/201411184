package com.sd.inhrt;

public class SelectMain {
	public static void main(String[] args) {
		Selection s = new Selection();
		Rectangle r = new Rectangle(20, 30);
		s.select(r);
		r.getSelected();
	}
}