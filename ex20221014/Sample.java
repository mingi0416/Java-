package com.human.ex20221014;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani = new Animal();
		ani.kind = "필드변수 kind";
		System.out.println(ani.kind);
		ani.walk();
		
		System.out.println(ani.toString());
		
	}
}

//상속 is-a
//상속 관계를 만들지 말지 

//사람 - 팔2 다리2 이름 인종 수명 키 몸무게 .... 
//한국사람 - 소주마시기, 예방접종맞기
//중국사람 - 고량주마시기
//일본사람 - 사케마시기

//동물
//고양이		사자		인간		선풍기

class Animal { //동물
	String kind; //종류
	int temperature; //체온
	
	void walk() { //걷는다
		System.out.println("동물이 걷는다");
	}
	void sleep() { //잔다
		System.out.println("동물이 잔다");
	}
	
	//보이지않는 부모 Object 에 이미 toString 있어요~
	public String toString() {  //toString 재정의 override toString();
		return "kind : " + kind + " temperature : " + temperature;
	}
}

class Cat extends Animal{
	void walk() { //걷는다
		System.out.println("소리없이 걷는다");
	}
	void sleep() { //잔다
		System.out.println("엎드려서 잔다");
	}
}

class Lion extends Animal{
	void walk() { //걷는다
	}
	void sleep() { //잔다
	}
}

class Person extends Animal{
	void walk() { //걷는다
	}
	void sleep() { //잔다
	}
}

class Fan {
	String kind; //선풍기 종류
	int volt;      //볼트
	
	//선풍기.walk();
	//선풍기.sleep(); 
}












