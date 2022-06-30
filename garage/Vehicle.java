package com.qa.garage;

public class Vehicle extends Garage{

	private int noOfWheels;
	private int noOfDoors;
	private int vehicleAge;
	private String fuelType;
	private String paintColour;
	private boolean hasRoof;
	private boolean passedMOT;
	private boolean canFly;
	
	
	public Vehicle(int noOfWheels, int noOfDoors, int vehicleAge, String fuelType, 
			String paintColour, boolean hasRoof,
			boolean passedMOT, boolean canFly) {
		super();
		this.noOfWheels = noOfWheels;
		this.noOfDoors = noOfDoors;
		this.vehicleAge = vehicleAge;
		this.fuelType = fuelType;
		this.paintColour = paintColour;
		this.hasRoof = hasRoof;
		this.passedMOT = passedMOT;
		this.canFly = canFly;
	}

	public int getNoOfWheels() {
		return this.noOfWheels;
	}
	
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public int getNoOfDoors() {
		return this.noOfDoors;
	}
	
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	public int getVehicleAge() {
		return this.vehicleAge;
	}
	
	public void setVehicleAge(int vehicleAge) {
		this.vehicleAge = vehicleAge;
	}
	
	public String getFuelType() {
		return this.fuelType;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public String getPaintColour(String paintColour) {
		return this.paintColour;
	}
	
	public void setPaintColour(String paintColour) {
		this.paintColour = paintColour;
	}
	
	public boolean isHasRoof() {
		return this.hasRoof;
	}
	
	public void setHasRoof(boolean hasRoof) {
		this.hasRoof = hasRoof;
	}
	
	public boolean isPassedMOT() {
		return this.passedMOT;
	}
	
	public void setPassedMOT(boolean passedMOT) {
		this.passedMOT = passedMOT;
	}
	
	public boolean isCanFly() {
		return this.canFly;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
}
