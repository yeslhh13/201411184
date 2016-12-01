package com.sd.poly;

public class ShapeMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3.0, 4.0);
		Circle c = new Circle(5.0);
		
		System.out.println("Rectangle, instanceof 사용 ----------");
		if (r instanceof Shape && r instanceof Rectangle)
			System.out.println(r.toString());
		
		Shape[] s = new Shape[2];
		s[0] = r;
		s[1] = c;
		
		//instanceof
		System.out.println("instanceof 사용 ----------");
		for (Shape sh: s) {
			if (sh instanceof Rectangle)
				System.out.println(sh.toString());
			else if (sh instanceof Circle)
				System.out.println(sh.toString());
		}
		
		//polymorphism
		System.out.println("다형성 이용 ----------");
		for (Shape sh: s)
			System.out.println(sh.toString());
	}
}