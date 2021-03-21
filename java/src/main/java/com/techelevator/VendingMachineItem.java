package com.techelevator;

public abstract class VendingMachineItem {

	// private members
	private String name;
	private String price;
	private String quantity;
	
	// constructor
	public VendingMachineItem(String name, String price) {
		this.name = name;
		this.price = price;
		this.quantity = "5";
	}

	// Getters
	public String getName() {
		return name;
	}
 
	public String getPrice() {
		return price;
	}	

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public void reduceQuantity() {
		if (quantity.equalsIgnoreCase("SOLD OUT")) {
			//nothing happens
		}
		else if (!(quantity.equalsIgnoreCase("SOLD OUT"))) {
			int quantityAsInt = Integer.parseInt(getQuantity());
			if(quantityAsInt > 1) {
				quantityAsInt--;
				String newQuantity = String.valueOf(quantityAsInt);
				setQuantity(newQuantity);
			} else if(quantityAsInt == 1) {
				setQuantity("SOLD OUT");
			}
		} 
	}

	// Abstract Methods
	public abstract void dispense();
	
} 
