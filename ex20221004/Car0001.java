package com.human.ex20221004;

public class Car0001 {
	
	//필드 : 선언만 되어 있음 = 변수 안에 값이 없음 (메모리 할당X)
	String company;
	static String model;
	String color;
	int maxSpeed;
	int speed;
	
	//생성자 : 클래스 이름과 동일 해야 함
	Car0001 (String inputData) {
		this.company = inputData;
		this.model = "제네시스 g80";
		this.color = inputData;
//		this.color = "블랙";
		this.maxSpeed = 300;
	}
	
	public static void testOutput() {
		System.out.println();
	}
	public void testOutput1() {
		System.out.println("김민기 test");
	}
}
