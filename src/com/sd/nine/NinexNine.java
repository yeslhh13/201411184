package com.sd.nine;

class NinexNine {
	int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public void makeList() {
		for (int i: x) {
			System.out.printf("\n%d´Ü -", i);
			for (int j: x)
				System.out.printf("\t%dx%d=%2d ", i, j, i * j);
		}
	}
	
	public static void main(String[] args) {
		NinexNine nn = new NinexNine();
		nn.makeList();
	}
}