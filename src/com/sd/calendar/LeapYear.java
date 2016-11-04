package com.sd.calendar;

class LeapYear {
	public void computeLeap(int[] year) {
		for (int y: year) {
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
				System.out.printf("year %d is a leap year\n", y);
			}
		}
	}
	
	public void computeLeap(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.printf("year %d is a leap year\n", year);
		}
	}
	
	public static void main(String[] args) {
		int[] year = { 1768, 1800, 1974, 1996, 2009, 2016 };
		
		LeapYear ly = new LeapYear();
		ly.computeLeap(year);
	}
}