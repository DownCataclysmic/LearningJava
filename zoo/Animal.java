package com.qa.zoo;

public class Animal {

	private int noOfLegs;
	private boolean canFly;
	private boolean hasScales;
	private boolean hasFur;
	private boolean coldBlooded;
	private String diet;
	
	public int noOfLegs() {
		return this.noOfLegs;
	}
	
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	public boolean isCanFly() {
		return this.canFly;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	public boolean isHasScales() {
		return this.hasScales;
	}
	
	public void setHasScales(boolean hasScales) {
		this.hasScales = hasScales;
	}
}
