package com.techelevator;

public class Chip extends VendingMachineItem{

	// instance variables
	protected final String DISPENSE_SOUND;
	
	// constructor
	public Chip(String name, String price) {
		super(name, price);
		this.DISPENSE_SOUND = "Crunch Crunch, Yum!";
	}

	// Methods 
	
	@Override
	public void dispense() {
		System.out.println("\n" + "You have purchased: " + getName() + " for $" + getPrice() + "\n" + DISPENSE_SOUND);
	}

}
