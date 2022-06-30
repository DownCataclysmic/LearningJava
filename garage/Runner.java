package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		
		 Car c1 = new Car(3, 7, "Petrol", "Silver", false, true, false);
		 Car c2 = new Car(5, 43, "Diesel", "Black", true, false, false);
		 Car c3 = new Car(5, 4, "Diesel", "Red", true, true, true);
	 
		 Motorbike m1 = new Motorbike(10, "Petrol", "Black", false, false);
		 Motorbike m2 = new Motorbike(5, "Diesel", "Silver", true, true);
		 Motorbike m3 = new Motorbike(8, "Diesel", "Silver", true, true);
		 
		 Plane p1 = new Plane(42, "White", true, 0);
		 Plane p2 = new Plane(2, "Red", false, 4);
		 Plane p3 = new Plane(7, "Silver", false, 2);
		 
		 Garage Garage = new Garage();
		 
		 Garage.addVehicle(c1);Garage.addVehicle(c2);Garage.addVehicle(c3);
		 Garage.addVehicle(m1);Garage.addVehicle(m2);Garage.addVehicle(m3);
		 Garage.addVehicle(p1);Garage.addVehicle(p2);Garage.addVehicle(p3);
		 
		 //Garage.removeOldCars(); //Not sure why this doesn't work
		 
		 Garage.produceInvoice(c1);Garage.produceInvoice(c2);Garage.produceInvoice(c3);
		 Garage.produceInvoice(m1);Garage.produceInvoice(m2);Garage.produceInvoice(m3);
		 Garage.produceInvoice(p1);Garage.produceInvoice(p2);Garage.produceInvoice(p3);
		 
		 Garage.emptyGarage();
	}
}
