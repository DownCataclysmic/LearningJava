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
	
	public void removeOldCars() { //This does not work, and I do not understand why.
		for (Vehicle v : Garage) {
			int vehicleAge = v.getVehicleAge();
			if (vehicleAge < 25)
				this.Garage.remove(v);
				System.out.println("This vehicle has is way too old, time to put them down.");
		}
	}
	
	void produceInvoice(Vehicle v) {
			   if (v instanceof Car) {
				   int vehicleAge = v.getVehicleAge();
				   boolean passedMOT = v.isPassedMOT();
				   boolean isAReliantRobin = ((Car) v).getIsAReliantRobin();
				   int billReliantRobin = isAReliantRobin ? -300:0;
				   int billPassedMOT = passedMOT ? 0:2000;

				   System.out.println("The bill is fix your car is £" + (200 + vehicleAge*30 + billPassedMOT + billReliantRobin) + ".");
		
		} else if (v instanceof Motorbike) {
				   int vehicleAge = v.getVehicleAge();
				   boolean passedMOT = v.isPassedMOT();
				   boolean anUberDriver = ((Motorbike) v).getUberDriver();
				   int billUberDriver = anUberDriver ? 0:500;
			       int billPassedMOT = passedMOT ? 0:1000;
			       
				   System.out.println("The bill is fix your motorbike is £" + (500 + vehicleAge*10 + billPassedMOT + billUberDriver) + ".");

		} else if (v instanceof Plane) {
			       int vehicleAge = v.getVehicleAge();
			       boolean passedMOT = v.isPassedMOT();
			       int noOfPropellers = ((Plane) v).getNoOfPropellers();
		           int billPassedMOT = passedMOT ? 0:20000;

				   System.out.println("The bill is fix your plane is £" + (5000 + vehicleAge*50 + billPassedMOT + noOfPropellers*100) + ".");
		}	   
			 
	}
	
	public void emptyGarage() {
		Garage.clear();
		System.out.println("The garage is now empty.");
	}

}
