package com.sd.draw;

import ch.aplu.turtle.*;

public class DrawTriangle {
	Turtle tt = new Turtle();
	void drawTriangle(int size) {
		for (int i = 0; i < 3; i++) {
			tt.forward(size);
			tt.right(120);
		}
	}
	
	public DrawTriangle(int size) {
		drawTriangle(size);
	}
	
	public static void main(String[] args) {
		new DrawTriangle(100);
	}
}