package com.sd.draw;

import ch.aplu.turtle.*;
import java.awt.geom.*;

public class DrawSquareAt {
	Turtle tt = new Turtle();
	void drawSquareAt(Point2D.Double p1, int size) {
		tt.setPos(p1);
		
		for (int i = 0; i < 4; i++) {
			tt.forward(size);
			tt.right(90);
		}
	}
	
	public DrawSquareAt(int x, int y, int size) {
		Point2D.Double p1 = new Point2D.Double(x, y);
		drawSquareAt(p1, size);
	}
	
	public static void main(String[] args) {
		new DrawSquareAt(30, 30, 100);
	}
}