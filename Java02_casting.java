package com.human.code20220915;

public class Java02_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int타입으로 변수이름 num10으로 선언
		//10이라는 데이터를 대입연산자(=) 좌측 num10변수에 전달(할당)
//		int num10 = 10;
//		//(num10 ==20) : num10 변수의 값이 20과 같으면 조건 성립(true)
//		//{}코드 영역 실행
//		if(num10 == 20) {
//			System.out.println("num10은 20이다!");
//		//if문의 조건이 성립되지 않을 경우에 else{}코드 영역 실행
//		}else if(num10 ==15){
//			System.out.println("num10은 15이다!");
//		}else if(num10 ==10){
//			System.out.println("num10은 10이다!");
//		//if문의 조건이 성립되지 않을 경우에 else{}코드 영역 실행
//		//모든 if문이 성립이 안될 경우에만 else{}코드 영역 실행!
//		} else {
//			System.out.println("num10은 20이 아니다!");
//		}
		
		//int 4byte
		//double 8byte : int보다 더 많은 숫자를 표현 할 수 있음
		//int 타입의 숫자를 double 타입으로 바꿀 수 있음
		
		//변수의 선언부는 바꿀 수 없지만, (정적 타입 선언)
		//데이터는 이동이 가능하므로 형변환(casting)이 존재
		
		//자동캐스팅X 강제캐스팅o double > int
		int intDataCasting = 1000;
		double doulbeDataCasting = 990;
		//double 영역은 int영역보다 크므로,
		//int 영역에서 double 데이터영역을 포함하지 못하여 에러가 발생
		//강제 캐스팅을 할 경우 캐스팅 대상 타입(int)에서 벗어난 데이터일 경우 손실 발생 위험 있음
		//(int) 문구 작성으로 double데이터를 int타입 변수에 강제적으로 할당
		intDataCasting = (int) doulbeDataCasting;
		System.out.println(intDataCasting);
		System.out.println(doulbeDataCasting);
		
		//자동 캐스팅 int > double
		int intData = 1000;
		double doubleData = 990;
		System.out.println(intData);
		System.out.println(doubleData);
		//intData 변수에 할당된 1000을 대입연산자(=)를 통해 doubleData변수에 저장(할당)
		doubleData = intData;
		System.out.println(doubleData);
	}

}
