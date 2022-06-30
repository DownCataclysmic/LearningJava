package com.qa.zoo;

public class Whale extends Mammal{

	@Override
	public void makeNoise() {
		System.out.println("Wooooaaahhh woaaaaahhhh");
	}
	
	public void murder() {
		System.out.println("Arg!");
	}
}
