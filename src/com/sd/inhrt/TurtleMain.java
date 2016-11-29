package com.sd.inhrt;

public class TurtleMain {
	public static void main(String[] args) {
		SeaTurtle st = new SeaTurtle();
		LandTurtle lt = new LandTurtle();
		
		int limb1 = st.getLimbs();
		int limb2 = lt.getLimbs();
		
		st.eat();
		st.setFood("seaweed");
		st.eat();
		
		lt.setFood("grass");
		lt.eat();
		
		st.swim();
		lt.walk();
		
		System.out.println("Sea Turtle's limbs: " + limb1 
				+ "\nLand Turtle's limbs: " + limb2);
	}
}