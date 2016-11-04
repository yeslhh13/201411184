package com.sd.bmi;

class BMI {
	public String computeBMI(float weight, float height) {
		float bmi = (float) weight / (height * height);
		System.out.printf("bmi = %.1f\n", bmi);
		
		if (bmi <= 18.5)
			return "low";
		else if (bmi >= 18.5 && bmi < 23)
			return "normal";
		else if (bmi >= 23 && bmi < 25)
			return "risky";
		else if (bmi >= 25 && bmi < 30)
			return "obesity 1";
		else if (bmi >= 30 && bmi < 40)
			return "obesity 2";
		else if (bmi >= 40)
			return "obesity 3";
		else
			return "error";
	}
	public static void main(String[] args) {
		float weight = (float) 80.5;
		float height = (float) 1.7;
		BMI bmi = new BMI();
		String cpte = bmi.computeBMI(weight, height);
		System.out.printf("Person whose weight = %.1f kg and height = %.1f m is %s\n",
					weight, height, cpte);
	}
}