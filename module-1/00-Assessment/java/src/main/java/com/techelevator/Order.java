package com.techelevator;

public class Order {

	private String bouquetType;
	private int numberOfRoses;
	private double subtotal;
		
	public Order() {
		bouquetType = null;
		numberOfRoses = 0;
	}
		
	public Order(String bouquetType, int numberOfRoses) {
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
	}

	public String getBouquetType() {
		return bouquetType;
	}

	public void setBouquetType(String bouquetType) {
		this.bouquetType = bouquetType;
	}

	public int getNumberOfRoses() {
		return numberOfRoses;
	}

	public void setNumberOfRoses(int numberOfRoses) {
		this.numberOfRoses = numberOfRoses;
	}

	public double getSubtotal() {
		subtotal = 19.99 + (2.99 * getNumberOfRoses());
		return subtotal;
	}
	
	public String toString() {
		return "ORDER - " + getBouquetType() + " - " + getNumberOfRoses() + " roses - $" + String.format("%.2f", getSubtotal());
	}
}
