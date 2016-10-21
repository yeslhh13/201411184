package com.sd.turtle;

import ch.aplu.turtle.*;

class P1TurtleTriangle {
	enum Shape {TRIANGLE, SQUARE};
	Shape shp = Shape.TRIANGLE;
	
	int size = 100;
	int sides;
	double angle;
	
	switch(shp) {
	case TRIANGLE:
		sides = 3;
		angle = 120.0;
		break;
		
	case SQUARE:
		sides = 4;
		angle = 90.0;
		break;
	}
	
	void drawSquareOrTriangle(int sides, double angle, int size) {
		tt.home();
		tt.clear();
		for (int i = 0; i < sides; i++) {
			tt.	forward(size);
			tt.right(angle);
		}
	}
	
	public static void main(String[] args) {
		Turtle tt = new Turtle();
		drawSquareOrTriangle(sides, angle, size);
	}
}