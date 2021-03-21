package com.techelevator;

public class Candy extends VendingMachineItem {

	// instance variables
	private final String DISPENSE_SOUND;

	// constructor
	public Candy(String name, String price) {
		super(name, price);
		this.DISPENSE_SOUND = "Munch Munch, Yum!";
	}

	// Methods 

	@Override
	public void dispense() {
		System.out.println("\n" + "You have purchased: " + getName() + " for $" + getPrice() + "\n" + DISPENSE_SOUND);
	}

}
