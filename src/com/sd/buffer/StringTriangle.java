package com.sd.buffer;

class StringTriangle {
	String s, s2;
	StringBuffer sbfr;
	
	public StringTriangle() {
		s = "*";
		s2 = " ";
		sbfr = new StringBuffer();
	}
	
	public void makeTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--)
				sbfr.append(s2);
			
			for(int j = 0; j < (2 * i - 1); j++)
				sbfr.append(s);
			
			System.out.printf("%s\n", sbfr.toString());
			sbfr.delete(0, sbfr.length());
		}
		
	}
	
	public static void main(String[] args) {
		StringTriangle st = new StringTriangle();
		st.makeTriangle(10);
	}
}