package com.human.ex20221014;

public class HankookTire implements Tire{
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	public HankookTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " "+" HankookTire 펑크 ***");
			return false;
		}
	}
}
