package com.human.ex20221014;

public class Car {
	//필드
	CarTire frontLeftTire = new CarTire("앞왼쪽", (int)((Math.random()*14)+1), "금호");
	CarTire frontRightTire = new CarTire("앞오른쪽", (int)((Math.random()*14)+1), "넥센");
	CarTire backLeftTire = new CarTire("뒤왼쪽", (int)((Math.random()*14)+1), "한국");
	CarTire backRightTire = new CarTire("뒤오른쪽", (int)((Math.random()*14)+1), "한국");

	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop(); 
			return 1; 
		};
		if(frontRightTire.roll()==false) { 
			stop(); 
			return 2; 
		};
		if(backLeftTire.roll()==false) { 
			stop(); 
			return 3; 
		};
		if(backRightTire.roll()==false) { 
			stop(); 
			return 4; 
		};
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

//	public boolean roll() {
//		// TODO Auto-generated method stub
//		return false;
//	}
}












