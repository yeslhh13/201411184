package com.sd.grade;

class Grades {
	double marks;
	String grade;
	
	public Grades(double marks) {
		this.marks = marks;
		grade = computeGrade(this.marks);
		System.out.printf("%.1f marks grade %s\n", marks, grade);
	}
	public String computeGrade(double marks) {
		if (marks >= 90 && marks <= 100)
			return "A";
		else if (marks >= 80 && marks < 90)
			return "B";
		else if (marks >= 70 && marks < 80)
			return "C";
		else if (marks >= 60 && marks < 70)
			return "D";
		else
			return "F";
	}
	
	public void computeAll(double[] marks) {
		for (double m : marks) {
			String grades = computeGrade(m);
			System.out.printf("%.1f marks grade %s\n", m, grades);
		}
	}
	
	public static void main(String[] args) {
		Grades gd = new Grades(87.0);
		
		double[] gds = { 65.3, 94.0, 75.8, 45.0, 89.5 };
		gd.computeAll(gds);
	}
}