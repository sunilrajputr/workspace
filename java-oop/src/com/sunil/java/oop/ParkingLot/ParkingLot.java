package com.sunil.java.oop.ParkingLot;

import java.util.Arrays;

public class ParkingLot {
	
	protected static ParkingLevels[] ParkingLevels = new ParkingLevels[5];
	protected int NUM_Levels = 5;
	
	public static void parkVehicle(Vehicle v){
		
		boolean isparkingavailable = isParkingAvaialble(v);
		
		if (isparkingavailable)
		{	
			ParkingSpot.park(ParkingLevels,v);
			
			for(ParkingLevels pl : ParkingLevels)
			{	
				if( pl != null )
				{
					for( ParkingSpot ps : pl.spots)
					{
						if( ps != null)
							System.out.println(" parked vehicle " + ps.vehicle.plateNo + " Parking level : " + pl.floor);
					}
				}
			}	
			System.out.println(" vehicle Parked " + Arrays.deepToString(ParkingLevels));
		}
	}
	
	public static boolean isParkingAvaialble( Vehicle v){
		
		if ( ParkingLevels.length == 0 )
			return true;
		
		for( ParkingLevels pl : ParkingLevels){
			
			//if(pl != null && pl.avaialble_sports_per_level  > 0) 
		//	{
				return true;
			//}
		} 
		
		return false;	
		
	}

}
