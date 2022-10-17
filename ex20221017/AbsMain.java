package com.human.ex20221017;

public class AbsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal ani1 = new Animal(); //추상클래스 생성 불가
//		ani1.sound();
		
		Animal ani2 = new Dog();
		ani2.kind = "포유류";
		ani2.sound();
		ani2.walk();
		
		Animal ani3 = new Cat();
		ani3.kind = "포유류";
		ani3.sound();
		ani3.walk();
	}

}

class Person{
	String name = "이름"; //필드변수 (변경 가능) //new person() 생설될때 생기는 필드변수
	final String type = "사람"; //final 바꿀 수 없는 필드변수
	static final String KIND = "포유류"; //상수형 클래스변수
	//생성하지 않아도 사용가능. Person.KIND; 
}

//class Animal{ //실체가 있는 클래스
abstract class Animal{ //추상 클래스
	String kind; //종류
	
	void sound() {
		System.out.println("소리를 낸다.");
	}
	
	abstract void walk(); //추상메소드
	//구현 몸통이 없다
	//자식클래스에서 필수! 무조건 구현해야한다
}

class Dog extends Animal{
	void sound() {
		System.out.println("개 소리를 낸다.");
	}
	void walk() {
		System.out.println("총총 걷는다");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("고양이 소리를 낸다.");
	}
	void walk() {
		System.out.println("사뿐사뿐 걷는다");
	}
}