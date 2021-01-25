package com.techelevator;

public class Elevator {
	
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	public Elevator(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if ((!doorOpen) && ((desiredFloor >= currentFloor) && (desiredFloor <= numberOfFloors))) {
		 currentFloor = (0 + desiredFloor);
		}
	}
	
	public void goDown(int desiredFloor) {
		if ((!doorOpen) && ((desiredFloor >= 1) && (desiredFloor <= currentFloor))) {
			currentFloor = (0 + desiredFloor);
			}
		}
	
	


}
