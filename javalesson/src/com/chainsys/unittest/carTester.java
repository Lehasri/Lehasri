package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class carTester {
	public static void testCar()
	{
		Car firstCar=new Car("IN 10A 001");
		firstCar.setColor("Red");
		firstCar.setFuel("petrol");
		firstCar.setYearofpurchase(2022);
		System.out.println(firstCar.getRegNo());
		System.out.println(firstCar.getColor());
		System.out.println(firstCar.getFuel());
		System.out.println(firstCar.getYearofpurchase());
		
		
		
		
	}

}
