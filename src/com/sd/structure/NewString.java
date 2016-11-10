package com.sd.structure;

import java.util.List;
import java.util.ArrayList;

class NewString {
	String[] strArr = new String[3];
	List<Integer> list = new ArrayList<Integer>();
	
	int index = 0;
	
	
	void add(String s) {
		if (index < strArr.length) {
			strArr[index] = s;
			System.out.println(s + " added");
			index++;
		}
	}
	
	public static void main(String[] args) {
		NewString ns = new NewString();
		
		ns.add(new String("Seoul"));
		System.out.println(ns.strArr);
		
		System.out.println("===========================================");
			
		for (int i = 0; i < 10; i++)
			ns.list.add(i);
			
		System.out.println(ns.list);
	}
}