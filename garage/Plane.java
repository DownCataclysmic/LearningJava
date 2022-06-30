package com.qa.garage;

public class Plane extends Vehicle{

	private int noOfPropellers;
	
	public Plane(int vehicleAge, String paintColour, boolean passedMOT, int noOfPropellers) {
		super(6, 2, vehicleAge, "Kerosene", paintColour, true, passedMOT, true);
		this.noOfPropellers = noOfPropellers;
	}
	
	public int getNoOfPropellers() {
		return this.noOfPropellers;
	}
	
	public void setNoOfPropellers(int noOfPropellers) {
		this.noOfPropellers = noOfPropellers;
	}
}