package com.techelevator;

public class Drink extends VendingMachineItem{

	// instance variables
	private final String DISPENSE_SOUND;

	// constructor
	public Drink(String name, String price) {
		super(name, price);
		this.DISPENSE_SOUND = "Glug Glug, Yum!";
	}

	// Methods 

	@Override
	public void dispense() {
		System.out.println("\n" + "You have purchased: " + getName() + " for $" + getPrice() + "\n" + DISPENSE_SOUND);
	}

}
