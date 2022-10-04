package com.human.ex20221004;

import java.util.ArrayList;
import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 20221004 history
		// 1. 클래스와 인스턴스
		// 2. 필드와 생성자
		// 3. 메서드
		
		//자동차 인스턴스
		//car001 변수에 Car타입으로 저장가능 (선언)
		//Car이라는 인스턴스(객체)를 만들어서
		//car001에 할당(저장)
		//인스턴스 : class(설계도) 토대로 새로 만드는 객체
		//(heap 메모리에 저장(참조타입))
		Car car001 = new Car();
		Car car002 = new Car();
		
		car002.color = "빨강";
		System.out.println(car001.model);
		System.out.println(car001.color);
		System.out.println("--------------");
		System.out.println(car002.model);
		System.out.println(car002.color);
		
		System.out.println("--------------");
		
		
		//객체 생성
		Car myCar = new Car();
		String stringcheckImpl = "test";
		String stringCheck = new String("test");
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		
		//example001. Car라는 클래스에 name이라는 변수를 넣고
		//인스턴스를 만들 때마다 이름을 부여하고
		//sysout으로 출력하시오
		Car carName001 = new Car();
		carName001.name = "김민기의 캐스퍼";
		System.out.println(carName001.name);
		System.out.println(carName001.model);
		
		ArrayList<Car> myCarList = new ArrayList<>();
		
		myCarList.add(carName001);
		myCarList.add(myCar);
		myCarList.add(car001);
		myCarList.add(car002);
		System.out.println("==================");
		System.out.println(carName001.info());
		
		System.out.println("==================");
		for(int i=0; i<myCarList.size(); i++) {
			System.out.println(myCarList.get(i).color);
		}
		System.out.println("==================");
		
		
	}

}
