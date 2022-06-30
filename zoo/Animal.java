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
	
	public void makeNoise() {
		System.out.println("Bloop");
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
	
	public boolean isHasFur() {
		return this.hasFur;
	}
	
	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	public boolean isColdBlooded() {
		return this.coldBlooded;
	}
	
	public void setColdBlooded(boolean coldBlooded) {
		this.coldBlooded = coldBlooded;
	}
	
	public String theirDiet() {
		return this.diet;
	}
	
	public void setTheirDiet(String diet) {
		this.diet = diet;
	}
}
