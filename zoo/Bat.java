package com.qa.zoo;

public class Bat extends Mammal{
	
	@Override
	public void makeNoise() {
		System.out.println("KAAAAAAAAAAH");
	}
	
	public void fly() {
		System.out.println("Flap flap");
	}
}
