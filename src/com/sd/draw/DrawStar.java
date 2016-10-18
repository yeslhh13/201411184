package com.sd.draw;

import ch.aplu.turtle.*;

public class DrawStar {
	Turtle tt = new Turtle();
	void drawStar(int size) {
		for (int i = 0; i < 5; i++) {
			tt.forward(size);
			tt.right(144);
			tt.forward(size);
			tt.left(72);
		}
	}
}