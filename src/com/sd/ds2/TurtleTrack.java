package com.sd.ds2;

import ch.aplu.turtle.*;

class TurtleTrack {
	static void drawSquareFrom(double[][] tracks) {
		Turtle tt = new Turtle();
		for (double[] t:tracks)
			tt.moveTo(t[0], t[1]);
	}
	
	public static void main(String[] args) {
		double[][] tracks = {{100, 100}, {200, 100}, {200, 200}, {100, 200}, {100, 100}};
		drawSquareFrom(tracks);
	}
}