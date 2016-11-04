package com.sd.calendar;

import java.util.Calendar;

class FirstDay {
	int startYear, endYear, count;
	
	public FirstDay() {
		startYear = 1901;
		endYear = 2000;
		count = 0;
	}
	
	public void computeSunday() {
		for (int i = startYear; i <= endYear; i++) {
			for (int j = 0; j < 12; j++) {
				Calendar c = Calendar.getInstance();
				c.set(i, j, 1);							//매년 매달 1일로 날자 세팅.
				if (c.get(Calendar.DAY_OF_WEEK) == 1)	//일요일이면 count++
					count++;
			}
		}
		System.out.println("20세기 100년 동안 매월 첫째 날에 일요일은 " + count + "회");
	}
	
	public static void main(String[] args) {
		FirstDay fd = new FirstDay();
		fd.computeSunday();
	}
}