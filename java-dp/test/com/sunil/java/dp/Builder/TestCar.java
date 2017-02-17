package com.sunil.java.dp.Builder;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sunil.java.dp.creational.Builder.Car;

public class TestCar {
	
	@Test
	public void testCamera()
	{
		Car.Carfeature caroptions = new Car.Carfeature();
		caroptions.Camera("Front");
		
		Car mycar = caroptions.build();
		
		Assert.assertEquals(mycar.getCamera(), "Fron1t");
	}

}
