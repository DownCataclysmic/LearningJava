package com.qa.garage;

public class Car extends Vehicle{
	
	public Car(int noOfDoors, int vehicleAge, String fuelType, 
			String paintColour, boolean hasRoof, boolean passedMOT) {
		super(4, noOfDoors, vehicleAge, fuelType, paintColour, hasRoof, passedMOT, false);	
	}
	
}
