package com.qa.zoo;

public class Runner {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.makeNoise();
		System.out.println(a);
		
		Mammal m = new Mammal();
		m.makeNoise();
		m.sweat();
		System.out.println(m);
		
		Bat b = new Bat();
		b.makeNoise();
		b.sweat();
		b.fly();
		System.out.println(b);
		
		Whale w = new Whale();
		w.makeNoise();
		w.sweat();
		w.murder();
		System.out.println(w);
	}
}
