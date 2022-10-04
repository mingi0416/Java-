package com.human.ex20221004;

public class java06_0002_init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Group group1 = new Group();
//		System.out.println(group1.info());
//		System.out.println(group1.randomStudentName());
		
//		System.out.println(group1.normalMethod("김민기"));
//		System.out.println(group1.normalMethod(123));
//		System.out.println(group1.genericMethod(123));
//		System.out.println(group1.genericMethod("김민기"));
		
		//1) 필드에 초기값 (캐스퍼)을 넣고 인스턴스를 만드는 경우
		//필드값에 초기값이 있다? = 설계도(class) 자체에 값이 있다
		
		//2) 생성자에 초기값(제네시스g80)을 넣고 인스턴스를 만드는 경우
		//생성자에 초기값이 있다? = 인스턴스를 생성할 때 값이 부여된다
		
		//생성자 : 인스턴스를 만들 때 고유한 스타일을 만드는 것(개성)
		//인스턴스를 [만드는 시점]에 필드 값을 지정
		Car0001 myCar1 = new Car0001("기아");
		Car0001 myCar2 = new Car0001("현대");
		//인스턴스가 만들어진 이후에 필드 값 변경
		System.out.println(myCar1.model);
		System.out.println(myCar2.model);
		myCar2.model = "K9";
		System.out.println(myCar1.model);
		System.out.println(myCar2.model);

		//static은 설계도(class)만 있어도 출력되는 타입
		//인스턴스를 만들기 전에 메모리에 이미 값이 있기 때문
		//static 선언 코드는 인스턴스끼리 공유하는 값(덮어쓸 경우,
		//다른 인스턴스에도 값이 변경)
		Car0001.testOutput();
		//static이 없으면 메모리에 할당(인스턴스화)를 해야 출력 가능
//		Car0001.testOutput1();
//		myCar1.testOutput1();
	}

}
