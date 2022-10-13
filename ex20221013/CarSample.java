package com.human.ex20221013;

public class CarSample {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Vehicle vehicle1 = bus;
		Vehicle vehicle2 = taxi;
		
		Driver driver = new Driver();
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(vehicle1);
		driver.drive(vehicle2);
	}

}
class Driver{
//	Vehicle[] myVehicles;
	Bus[] myBus; //버스 2대
	Taxi myTaxi; //택시 1대
	void cleanAllMyCar() {
		//1. 상속이 없을때
//		myTaxi.clean();
//		myBus.clean();
		//2. 상속이 있을 때
//		myVehicles.clean();
	}
	
	void drive(Vehicle vehicle) {
		System.out.println("drive Vehicle");
		vehicle.run();
	}
	void drive(Bus bus) {
		System.out.println("drive Bus");
		bus.run();
	}
	void drive(Taxi taxi) {
		System.out.println("drive Taxi");
		taxi.run();
	}
}

class Vehicle{
	void run() {
		System.out.println("탈것이 달립니다.");
	}
}
class Bus extends Vehicle{
	void run() {
		System.out.println("버스가 달립니다.");
	}
}
class Taxi  extends Vehicle{
	void run() {
		System.out.println("택시가 달립니다.");
	}
}