package com.sd.coffee;

class Robusta extends CoffeeBeans {
	String species = "Robusta";
	void print() {
		System.out.printf("%s: overriding Coffee Beans..", species);
	}
}