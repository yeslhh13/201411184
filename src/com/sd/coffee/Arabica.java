package com.sd.coffee;

class Arabica extends CoffeeBeans {
	void setSpecies(String s) {
		this.species = s;
	}
	void print() {
		System.out.println("Arabica: overriding Coffee Beans..");
	}
	void print(String s) {
		System.out.printf("%s: %s", species, s);
	}
}