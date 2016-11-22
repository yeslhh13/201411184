package com.sd.coffee;

class CoffeeMain {
	public static void main(String[] args) {
		CoffeeBeans arabica = new Arabica();
		arabica.print();
		
		CoffeeBeans coffeeRobusta = new Robusta();
		coffeeRobusta.print();
	}
}