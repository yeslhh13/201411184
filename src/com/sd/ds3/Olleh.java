package com.sd.ds3;

class Olleh {
	
	static void mirror(StringBuilder sb, String str) {
		char[] charh = str.toCharArray();
		
		for (int i = charh.length - 1; i >= 0; i--)
			sb.append(charh[i]);
	}
	
	public static void main(String[] args) {
		String hello = "hello";
		StringBuilder olleh = new StringBuilder();
		
		mirror(olleh, hello);
		System.out.println("Mirror " + hello + " = " + olleh.toString());
	}
}