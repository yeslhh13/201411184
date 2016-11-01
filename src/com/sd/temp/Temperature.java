package com.sd.temp;

class Temperature {	
	String sel;
	double temp;
	
	public Temperature(String sel, double temp) {
		this.sel = sel;
		this.temp = temp;
	}
	
	public void changeTemp() {
		if (sel.equals("C"))
			System.out.printf("%.1f%s == %.1fF\n", temp, sel, (temp * 1.8) + 32);
		else
			System.out.printf("%.1f%s == %.1fC\n", temp, sel, (temp - 32) / 1.8);
	}
	
	public static void main(String[] args) {
		String sel = "F";
		double temp = 25.1;
		
		System.out.printf("%.1f%s\n", temp, sel);
		
		Temperature tp = new Temperature(sel, temp);
		tp.changeTemp();
	}
}