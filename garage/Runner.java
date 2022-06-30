package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		
		 Car c1 = new Car(3, 7, "Petrol", "Silver", false, true);
		 Car c2 = new Car(5, 20, "Petrol", "Black", true, false);
		 Car c3 = new Car(5, 4, "Diesel", "Red", true, true);
	 
		 Motorbike m1 = new Motorbike(10, "Petrol", "Black", false);
		 Motorbike m2 = new Motorbike(5, "Diesel", "Silver", true);
		 Motorbike m3 = new Motorbike(8, "Diesel", "Silver", true);
		 
		 Plane p1 = new Plane(42, "White", true);
		 Plane p2 = new Plane(2, "White", true);
		 Plane p3 = new Plane(7, "Silver", false);
		 
		 Garage Garage = new Garage();
		 
		 Garage.addVehicle(c1);Garage.addVehicle(c2);Garage.addVehicle(c3);
		 Garage.addVehicle(m1);Garage.addVehicle(m2);Garage.addVehicle(m3);
		 Garage.addVehicle(p1);Garage.addVehicle(p2);Garage.addVehicle(p3);
		 
		 Garage.produceInvoice(c1);Garage.produceInvoice(c2);Garage.produceInvoice(c3);
		 Garage.produceInvoice(m1);Garage.produceInvoice(m2);Garage.produceInvoice(m3);
		 Garage.produceInvoice(p1);Garage.produceInvoice(p2);Garage.produceInvoice(p3);
		 
	}
}
