package com.sunil.java.oop.ParkingLot.client;

import com.sunil.java.oop.ParkingLot.Car;
import com.sunil.java.oop.ParkingLot.Motercycle;
import com.sunil.java.oop.ParkingLot.ParkingLot;
import com.sunil.java.oop.ParkingLot.ParkingSpot;
import com.sunil.java.oop.ParkingLot.Vehicle;

public class sampleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle jeep = new Car("1234");
		boolean isparkingavailable = jeep.isParkingAvailable();
		
		if (isparkingavailable)
			ParkingSpot.park(jeep);
		
		ParkingLot.parkVehicle(jeep);
		
		Vehicle bmw = new Car("BMW");
		isparkingavailable = bmw.isParkingAvailable();
		
		if (isparkingavailable)
			ParkingSpot.park(bmw);

		ParkingLot.parkVehicle(bmw);
		
		Vehicle motercycle = new Motercycle ("motercycle");
		isparkingavailable = motercycle.isParkingAvailable();
		
		if (isparkingavailable)
			ParkingSpot.park(motercycle);

	//	System.out.println(" sys prop " + System.getProperty("sun.boot.class.path"));
	//	System.out.println(" ext prop " + System.getProperty("java.ext.dirs"));
		
		ParkingLot.parkVehicle(motercycle);
		ParkingSpot.exitParking(bmw);
		
		
	}

}
