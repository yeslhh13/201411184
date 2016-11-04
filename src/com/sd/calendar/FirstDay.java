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
				c.set(i, j, 1);							//�ų� �Ŵ� 1�Ϸ� ���� ����.
				if (c.get(Calendar.DAY_OF_WEEK) == 1)	//�Ͽ����̸� count++
					count++;
			}
		}
		System.out.println("20���� 100�� ���� �ſ� ù° ���� �Ͽ����� " + count + "ȸ");
	}
	
	public static void main(String[] args) {
		FirstDay fd = new FirstDay();
		fd.computeSunday();
	}
}