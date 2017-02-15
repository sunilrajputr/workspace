package com.sunil.java.oop.ParkingLot;

import java.util.HashMap;

public class ParkingSpot {
	
	protected static int availableSpace = 3;
	static int spotNumber = 0;
	protected Vehicle vehicle;
	
	public ParkingSpot( int number , Vehicle v1){
		this.spotNumber = number;
		this.vehicle = v1;
	}
	
	protected static HashMap<String, Integer> vehicleSpace = new HashMap<String,Integer>();
	
	protected static void allocateSpace(Vehicle v){
		vehicleSpace.put(v.plateNo,++spotNumber);	
		availableSpace--;
	}
	
	protected void removeVehicle( Vehicle v){
		
		vehicleSpace.remove(v.plateNo);
	}
	
	public static void park( Vehicle v){
		
		if (isParkingAvaiable())
		{
			allocateSpace(v);
			System.out.println(" vehicles " + vehicleSpace);
		}
		else
		{
			System.out.println(" Sorry Parking is not available ");
		}
		
	}

	protected static boolean isParkingAvaiable() {
		if ( availableSpace > 0 )
			return true;
		
		return false;
	}

	public static void exitParking(Vehicle bmw) {
		
		vehicleSpace.remove(bmw.plateNo);
		
		System.out.println(" parked vehicles " + vehicleSpace);
		
	}

	protected static void park(ParkingLevels[] parkingLevels, Vehicle v) {
		
		int parkingspot = 0;
		int parkingLevel = 0;
		
		for(ParkingLevels pl : parkingLevels)
		{
			if( pl == null ){
				
				pl = new ParkingLevels(parkingLevel);
				ParkingSpot ps = new ParkingSpot(parkingspot,v);
								
				//pl.spots[parkingspot] == null
				pl.spots[parkingspot] = ps;
				pl.avaialble_sports_per_level--;
				parkingLevels[parkingLevel] = pl;
				parkingLevel++;
				parkingspot ++;
				break;
			}
			else if ( pl.avaialble_sports_per_level > 0 )
			{
				ParkingSpot ps = new ParkingSpot(parkingspot,v);
				
				for( ParkingSpot ps1 : pl.spots)
				{
					if ( ps1 == null )
					{
						pl.spots[parkingspot] = ps;
						pl.avaialble_sports_per_level--;
						//parkingLevels[parkingspot] = pl;
						//break;
						return;
					}
					parkingspot ++;				
				}
			}
			else
			{
				parkingLevel++;	
			}
		}

	}
}
