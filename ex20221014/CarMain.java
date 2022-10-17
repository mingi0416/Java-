package com.human.ex20221014;

public class CarMain extends CarTire{

	public CarMain(String location, int maxRotation, String brand) {
		super(location, maxRotation, brand);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		for(int i=1; i<=5; i++) {  //i : 1 ~ 5 다섯번
			
			int problemLocation = car.run(); //car 달려라. return 활용
								  //return 0 1 2 3 4
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 금호 Tire로 교체");
				car.frontLeftTire = new CarTire("앞왼쪽", 15, "금호");
				break;
			case 2:
				System.out.println("앞오른쪽 넥센 Tire로 교체");
				car.frontRightTire = new CarTire("앞오른쪽", 15, "넥센");	
				break;
			case 3:
				System.out.println("뒤왼쪽 한국 Tire로 교체");
				car.backLeftTire = new CarTire("뒤왼쪽", 15, "한국");	
				break;
			case 4:
				System.out.println("뒤오른쪽 한국 Tire로 교체");
				car.backRightTire = new CarTire("뒤오른쪽", 15, "한국");		
				break;
			}
			System.out.println("----------------------------------------");
			
		}
		
		
		
	}
}



