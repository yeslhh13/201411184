package com.sd.inhrt;

public class Selection {
	Selection() {};
	
	public void select(Rectangle r) {
		r.setSelected(true);
		System.out.println("selected: " + r.isSelected);
	}
}