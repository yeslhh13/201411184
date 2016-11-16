package com.sd.ds3;

import java.util.ArrayList;
import java.util.Collections;

class Student {
	private String name;
	private int stdNum;
	
	Student(String name, int snum) {
		this.name = name;
		this.stdNum = snum;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		ArrayList<String> snameList = new ArrayList<String>();
		
		Student s1 = new Student("ys 1", 1);
		Student s2 = new Student("ys 2", 2);
		
		snameList.add(s2.getName());
		snameList.add(s1.getName());
		
		Collections.sort(snameList);
		
		for (String s : snameList)
			System.out.println(s);
	}
}