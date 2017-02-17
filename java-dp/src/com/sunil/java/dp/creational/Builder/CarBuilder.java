package com.sunil.java.dp.creational.Builder;

public class CarBuilder {

	public static void main(String[] args) {

		Car.Carfeature carOptions = new Car.Carfeature();
		
		carOptions.Camera("Front").ClimateControl("Dual").Entertaiment("MP3");
	
		Car mycar = carOptions.build();
		
		System.out.println(" Car with customized Options : " );
		System.out.println("Camera : " + mycar.getCamera() );
		System.out.println("ClimateControl : " + mycar.getClimateControl() );
		System.out.println("Entertainment : "+ mycar.getEntertaiment() );
		System.out.println("GPS : " + mycar.getGPS());

	}

}
