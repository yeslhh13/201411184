package com.sd.rps;

class RockPaperScissors {
	String sel1, sel2;
	
	public RockPaperScissors(String sel1, String sel2) {
		this.sel1 = sel1;
		this.sel2 = sel2;
		
		rspPlay(sel1, sel2);
	}
	
	public void rspPlay(String sel1, String sel2) {
		if (sel1.equals("가위")) {
			if (sel2.equals("바위"))
				System.out.println("sel2 won");
			else if (sel2.equals("보"))
				System.out.println("sel1 won");
			else
				System.out.println("sel1 and sel2 draw!");
		}
		else if (sel1.equals("바위")) {
			if (sel2.equals("보"))
				System.out.println("sel2 won");
			else if (sel2.equals("가위"))
				System.out.println("sel1 won");
			else
				System.out.println("sel1 and sel2 draw!");
		}
		else {
			if (sel2.equals("가위"))
				System.out.println("sel2 won");
			else if (sel2.equals("바위"))
				System.out.println("sel1 won");
			else
				System.out.println("sel1 and sel2 draw!");
		}
	}
	
	public static void main(String[] args) {
		String sel1 = "가위";
		String sel2 = "바위";
		
		System.out.println("sel1 = " + sel1 + ", sel2 = " + sel2);
		RockPaperScissors rps = new RockPaperScissors(sel1, sel2);
	}
}