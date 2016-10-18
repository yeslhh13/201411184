package com.sd.draw;

import ch.aplu.turtle.*;

public class DrawSquare {
	Turtle tt = new Turtle();
	public void drawSquare(int size) {
		for (int i = 0; i < 4; i++) {
			tt.forward(size);
			tt.right(90);
		}
	}
	
	public DrawSquare(int size) {
		drawSquare(size);
	}
	
	public static void main(String[] args) {
		new DrawSquare(100);
	}
}