package com.sd.ds3;

import java.util.*;

class CountChars {
	
	static Map countChars(String str) {
		Map<String, Integer> wc = new HashMap<String, Integer>();
		String s;
		char[] strarray = str.toCharArray();
		
		for (char c : strarray) {
			s = Character.toString(c);
			if (wc.containsKey(s))
				wc.put(s, wc.get(s) + 1);
			else
				wc.put(s, 1);
		}
		
		return wc;
	}
	
	public static void main(String[] args) {
		String letters = "sangmyung university";
		System.out.println("'" + letters + "' to HashMap: " + countChars(letters));
	}
}