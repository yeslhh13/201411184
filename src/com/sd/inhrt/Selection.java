package com.sd.inhrt;

import java.util.ArrayList;
public class Selection {
	Selection() {};
	ArrayList<Rectangle> sArr = new ArrayList<Rectangle>();
	
	public void select(Rectangle r) {
		r.setSelected(true);
		sArr.add(r);
		System.out.println(r.getClass() + " - selected: " + r.isSelected);
	}
	
	public void print() {
		for (Rectangle r : sArr)
			System.out.println(r.toString());
	}
}