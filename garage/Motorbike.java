package com.qa.garage;

public class Motorbike extends Vehicle {
	
	private boolean uberDriver;

	public Motorbike(int vehicleAge, String fuelType, String paintColour,
			boolean passedMOT, boolean uberDriver) {
		super(2, 0, vehicleAge, fuelType, paintColour, false, passedMOT, false);
		this.uberDriver = uberDriver; //I realise car drivers can also be uber drivers,
	}								  //but lets just assume it's more dangerous and hence why
									  //the bill would be more expensive.
	public boolean getUberDriver() {
		return this.uberDriver;
	}
	
	public void setUberDriver(boolean uberDriver) {
		this.uberDriver = uberDriver;
	}
}
