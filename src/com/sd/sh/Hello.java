package com.sd.sh;

public class Hello {
	private String name;
	public Hello(String name) {
		this.name = name;
	}
	public void sayHello() {
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) {
		Hello[] h = new Hello[5];
		h[0] = new Hello("nys");
		h[1] = new Hello("ksy");
		h[2] = new Hello("bje");
		h[3] = new Hello("hsy");
		h[4] = new Hello("ljs");
		
		//for (int i = 0; i < h.length; i++) {
		//	System.out.println(h[i]);
		//	h[i].sayHello();
		//}
		
		for (Hello he : h) {
			System.out.println(he);
			he.sayHello();
		}
	}
}