package com.human.ex20221017;

public class ObjectGrouping {
	public static void main(String[] args) {
		// 다양한 객체 생성
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();
		// 인터페이스 타입으로 그룹화
		Flyable[] flyableThings = { bird, copter, rocket };
		// 모든 날것들을 날림
		for (int i = 0; i < flyableThings.length; i++) {
			Flyable temp = flyableThings[i];
			temp.fly();
			
			if(temp instanceof Rocket) {
				Rocket rk = 
			}
		}
	}
}

interface Flyable {
	public void fly();
}

interface Bombable{
	public void bomb();
}

class Bird implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("새가 날개를 퍼덕이며 날아갑니다!");
	}
	
}

class Rocket implements Flyable, Bombable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("로켓이 제트 엔진을 분출하며 날아갑니다!");
	}

	@Override
	public void bomb() {
		// TODO Auto-generated method stub
		System.out.println("로켓이 폭발했습니다");
	}
	
}

class Helicopter implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("헬리콥터가 프로펠러를 힘차게 돌리며 날아갑니다!");
	}
	
}