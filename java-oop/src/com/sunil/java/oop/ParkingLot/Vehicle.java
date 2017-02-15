package com.sunil.java.oop.ParkingLot;

public abstract class Vehicle {
	
	protected String plateNo;

	public boolean isParkingAvailable(){

		if(ParkingSpot.isParkingAvaiable())
			return true;
		
		return false;
	}
	//private 
	
}
