package com.techelevator;

public class Gum extends VendingMachineItem{

	// instance variables
	private final String DISPENSE_SOUND;

	// constructor
	public Gum(String name, String price) {
		super(name, price);
		this.DISPENSE_SOUND = "Chew Chew, Yum!";
	}

	// Methods 

	@Override
	public void dispense() {
		System.out.println("\n" + "You have purchased: " + getName() + " for $" + getPrice() + "\n" + DISPENSE_SOUND);
	}

}
