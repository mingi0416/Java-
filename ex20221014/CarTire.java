package com.human.ex20221014;

public class CarTire implements Tire{
	int maxRotation;
	int accumulatedRotation;
	String location;
	String brand;
	
	public CarTire(String location, int maxRotation, String brand) {
		this.location = location;
		this.maxRotation = maxRotation;
		this.brand = brand;
	}

	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location +" "+ brand +" Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " "+ brand +" Tire 펑크 ***");
			return false;
		}
	}
}
