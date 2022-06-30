package com.qa.garage;

public class Car extends Vehicle{
	
	private boolean isAReliantRobin;
	
	public Car(int noOfDoors, int vehicleAge, String fuelType, 
			String paintColour, boolean hasRoof, boolean passedMOT, boolean isAReliantRobin) {
		super(4, noOfDoors, vehicleAge, fuelType, paintColour, hasRoof, passedMOT, false);
		this.isAReliantRobin = isAReliantRobin;
	}
	
	public boolean getIsAReliantRobin() {
		return this.isAReliantRobin;
	}
	
	public void setIsAReliantRobin(boolean isAReliantRobin) {
		this.isAReliantRobin = isAReliantRobin;
	}
	
}
