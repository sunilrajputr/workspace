package com.sunil.java.oop.ParkingLot;

public class ParkingLevels {
	
	int floor;
	int avaialble_sports_per_level = 2;
	ParkingSpot[] spots = new ParkingSpot[avaialble_sports_per_level];
	int spots_per_row = 10;
	
	public ParkingLevels(int Floor){
		this.floor = Floor;
	}

}
