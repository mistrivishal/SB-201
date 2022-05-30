package com.masai.Q3;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			return new HatchBack(numberOfKMs);
		}else {
			return new Sedan(numberOfKMs);
		}
	}
	public int calculateBill(Car car) {
		
		if(car instanceof Sedan) {
			return ((Sedan)car).farePerKm*car.getNumberOfKms();
		}else {
			return ((HatchBack)car).farePerKm*car.getNumberOfKms();
		}
		
	}
}
