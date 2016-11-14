package com.sd.ds2;

import ch.aplu.turtle.*;
import java.util.ArrayList;

class TurtleSquare {
	public ArrayList<Double[]> posArr = new ArrayList<Double[]>();
	Turtle tt = new Turtle();
	
	public void drawSquareAtSave(int size) {
		
		for (int i = 0; i < 4; i++) {
			Double[] pos = new Double[2];
			pos[0] = tt.getX();
			pos[1] = tt.getY();
			posArr.add(pos);
			tt.forward(size);
			tt.right(90);
		}
	}
	
	public void printArray() {		
		for (Double[] d : posArr)
			System.out.printf("(%.1f, %.1f)", d[0], d[1]);
	}
	
	public static void main(String[] args) {
		TurtleSquare ts = new TurtleSquare(); 
		ts.drawSquareAtSave(200);
		ts.printArray();
	}
}