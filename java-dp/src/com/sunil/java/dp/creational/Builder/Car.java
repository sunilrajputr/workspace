package com.sunil.java.dp.creational.Builder;

public class Car {
	
	public static class Carfeature {

		private String Camera;
		private String GPS;
		private String ClimateControl ;
		private String Entertaiment;
		
		public Carfeature(){
			this.Camera = "";
			this.GPS = "";
		}
		
		public Carfeature Camera(String camera ){
			this.Camera = camera;
			return this;
		}

		public Carfeature GPS(String gps ){
			this.GPS = gps;
			return this;
		}

		public Carfeature ClimateControl(String climateControl ){
			this.ClimateControl = climateControl;
			return this;
		}

		public Carfeature Entertaiment(String entertaiment ){
			this.Entertaiment = entertaiment;
			return this;
		}

		public Car build() {
			// TODO Auto-generated method stub
			return new Car(this);
		}

	}

	private Car ( Carfeature carfeature){
		this.Camera = carfeature.Camera;
		this.GPS = carfeature.GPS;
		this.ClimateControl = carfeature.ClimateControl;
		this.Entertaiment = carfeature.Entertaiment;
		
	}

	private String Camera;
	private String GPS;
	private String ClimateControl;
	private String Entertaiment;
	
	public String getCamera(){
		return Camera;
	}


	public String getGPS() {
		return GPS;
	}


	public String getClimateControl() {
		return ClimateControl;
	}


	public String getEntertaiment() {
		return Entertaiment;
	}
	
	 
	
	

}
