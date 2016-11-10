package com.sd.arraylist;

import java.util.ArrayList;
import java.util.List;

class Numbers {
	ArrayList<Integer> mylist;
	
	Numbers() {
		mylist = new ArrayList<Integer>();
		setNumbers();
		printList();
		
		System.out.printf("1���� 1000�� �� ��� 4�� ���������� 5�� ���������� �ʴ� ���� ��: %d\n", sumList());
	}
	
	void setNumbers() {
		for (int i = 1; i <= 1000; i++) {
			if (i % 4 == 0) {
				if (i % 5 != 0)
					mylist.add(i);
			}
		}
	}
	
	void printList() {
		System.out.print("[");
		
		for (int i : mylist)
			System.out.print(i + ", ");
		
		System.out.print("]\n");
	}
	
	int sumList() {
		int sum = 0;
		
		for (int i : mylist)
			sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Numbers nbrs = new Numbers();
	}
}