package com.sd.turtle;

import ch.aplu.turtle.*;

public class TurtleDemoMain {
	TurtleDemoMain() {
		Turtle tt = new Turtle();
		for (int i = 0; i < 4; i++) {
			tt.forward(50);
			tt.left(90);
		}
	}
	public static void main(String[] args) {
		new TurtleDemoMain();
	}
}
