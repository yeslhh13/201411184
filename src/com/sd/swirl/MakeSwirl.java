package com.sd.swirl;

import ch.aplu.turtle.*;

class MakeSwirl {
	Turtle tt = new Turtle();
	
	void makeSwirlSquare(int size, int bigger, int turns, int degree) {
		for (int i = 0; i < turns; i++) {
			if (i % 2 != 0)
				size += bigger;
			tt.forward(size);
			tt.right(degree);
		}
	}
	public static void main(String[] args) {
		MakeSwirl ms = new MakeSwirl();
		ms.makeSwirlSquare(5, 5, 30, 90);
	}
}