package com.qa.garage;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> Garage = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		this.Garage.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		this.Garage.remove(v);

	}
	
	void produceInvoice(Vehicle v) {
			   if (v instanceof Car) {
				   int vehicleAge = v.getVehicleAge();
				   boolean passedMOT = v.isPassedMOT();
				   int billPassedMOT = passedMOT ? 0:2000;

				   System.out.println("The bill is fix your vehicle is £" + (200 + vehicleAge*30 + billPassedMOT) + ".");
		
		} else if (v instanceof Motorbike) {
				   int vehicleAge = v.getVehicleAge();
				   boolean passedMOT = v.isPassedMOT();
			       int billPassedMOT = passedMOT ? 0:1000;
			       
				   System.out.println("The bill is fix your vehicle is £" + (500 + vehicleAge*10 + billPassedMOT) + ".");

		} else if (v instanceof Plane) {
			       int vehicleAge = v.getVehicleAge();
			       boolean passedMOT = v.isPassedMOT();
		           int billPassedMOT = passedMOT ? 0:20000;

				   System.out.println("The bill is fix your vehicle is £" + (5000 + vehicleAge*50 + billPassedMOT) + ".");
		}
	}

	//@Override
	//public String toString() {
		//return "Garage [Garage=" + Garage + "]";
	//}
}
