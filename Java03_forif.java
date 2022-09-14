package com.human.ex;

public class Java03_forif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for 반복문 (특정 코드를 반복적으로 실행하는 구문)
		//for() ()안에 트정조건이 만족할 떄 까지 반복하는 구문
		//선언부(초기식)
		//int i = 0; i라는 변수에 int 타입으로만 들어간다고 선언
		//i에 0이라는 데이터를 할당 (= 대입연산자)
		//조건부 
		//i < 10; i라는 변수가 10 미만일 경우까지 for문을 실행
		//증감식
		//i++ = for문 한 번 실행 될 때마다 i변수는 1씩 증가
//		int sum = 1;
//		for(int i =1; i <= 10; i ++) {
//			System.out.println("for문 시작 " + i + "입니다");
//			//sum은 처음에 0이고,
//			//for문 1번 돌아갈 때 마다 i가 1씩 증가하므로
//			//sum은 for문이 돌아갈 때 마다 i의 값을 계속 더함
//			//sum /i
//			//0 / 0 = 0
//			//0 / 1 = 1
//			//1 / 2 = 3
//			//3 / 3 = 6
//			sum = sum * i;
//			System.out.println(sum);
//		}
		
		//문제
		//int num10 = 24을 할당해주고,
		//24을 지속적으로 1/2로 줄인다면 몇 번에 걸쳐서 줄여야
		//0이 되는지 알수있는 for문을 작성하시오
		//Console 예)
		//for문 시작 3입니다
		//num10은 지금 **입니다.

//		double sum = 24;
//		for(int i = 1; i<=10; i++) {
//			System.out.println("for문 시작 " +i+" 입니다");
//			sum = sum / 2;
//			System.out.println(sum);
//		}
//		
		//int는 정수를 표헌하는 타입이므로 소수점 표현 불가
//		int intExample = 1;
//		//double은 소수점을 표현하는 타입이므로 1.0처럼 소수점 표기
//		double doubleExample = 1;
//		//float은 소수점을 표현하는 타입이므로 1.0처럼 소수점 표기
//		float floatExample = 1;
//		
//		System.out.println(intExample);
//		System.out.println(doubleExample);
//		System.out.println(floatExample);
		
		//double num10 = 1048을 할당해주고, (정수는 0, 1, 2, 3, 4...)
		//1048을 지속적으로 1/2로 줄인다면 몇 번에 걸쳐서 줄여야
		//2보다 작게 되는지 알수있는 출력하는 for문을 작성하시오
		//Console 예)
		//for문 시작 3입니다
		//num은 지금 **입니다
		
		//double : num10이라는 변수에 들어갈 수 있는 타입을 선언
		//num10 : 변수 이름
		//=1048; : 1048이라는 데이터를 =(대입연산자) 좌측에 있는 변수에다가 넣기 (할당)
		// == 2보다 작으면 for문을 종료
		
//		double num10 = 1048;
//		//int i=1; : for()은 변수 i가 1부터 시작
//		//i<=10; : i가 10 이하일때까지 for문을 반복실행
//		//i++ : i가 for문 한 번 돌아갈 때마다 i는 1씩 증가한다 (i++) == i = i+1
//		for(int i = 1; i<=10; i++) {
//			System.out.println("for문 시작 " + i + " 번째 입니다");
//			// =(대입연산자) 기준으로 우측에 있는 코드를 실행하고, 결과값을 좌측에 할당
//			// num10 / 2의 값이 대입연산자 좌측에 있는 num10이라는 변수에 넣기(할당)
//			num10 = num10/2;
//			System.out.println("num10은 지금 "+ num10 + "입니다");
//			if(num10<2) {
//				System.out.println("num10이 2보다 작습니다. for문을 종료합니다.");
//			}
//		}
//		
		//int i는 for문을 몇 번 돌렸는지 확인하는 변수(변하는 수)
//		int i = 1;
//		//double num10 = 1048은 값의 초기값
//		//num10>2; 조건식으로써 num10이 2보다 클 때까지(조건이 성립이 되서) for문을 돌리겠다!
//		//for(조건식)에서 먼저 확인되는 우선순위
//		//1. 초기식 double num10 = 1048;
//		//2. 조건식 num10>2; 확인
//		//3. {} 코드 실행
//		//4. 증감식 i++은 for문이 1회 모두 실행 된 후에 i의 값이 변동 뒤 2번으로 이동 실행
//		for(double num10 = 1048; num10>2; i++) {
//			System.out.println("for문 시작 " + i + "번째 입니다.");
//			System.out.println("num10은 지금" + num10 + "입니다.");
//			num10 = num10/2;
//		}
		
		//if 조건문 (특정 코드를 일정한 조건(조건이 성립할 경우)에 의해 실행하는 구문)
		//if(true) 항상 if문 조건절에 true가 되도록 조건을 성립하면 {}코드 실행
//		if((2*2) > 3) {
//			System.out.println("if문 실행");
//		}
		
//		String stringA = "abcd";
//		char charA = 'a';
//		System.out.println(charA+" "+stringA);
		
		
//		for(int i = 0; i<5; i++) {
//			System.out.println(i+ "를 2로 나누면 나머지가 " + i%2);
//		}
		
		//숫자 1부터 30까지 순회(반복)하면서
		//2로 나누어서 나머지가 없는 숫자를 출력하시오
//		for(int j = 1; j<=30; j++) {
//			if(j%2==0) {
//				System.out.println(j);
//			}
//		}
		
		//2중 포문 = for문 안에 for문
//		for(int a=0; a<=5; a++) {
//			System.out.println("@@현재 for문 a실행 중!! a의 값은" + a);
//			for(int b=0; b<=3; b++) {
//				System.out.println("##현재 for문 b실행 중!! b의 값은" + b);
//			}
//		}
		
		//3의 배수
//		for(int k = 0; k<=30; k=k+3) {
//			//!란 반전의 의미, 거꾸로!!
//			//!=는 같지 않다
//			//if(k!=0) if문은 k가 0 과 같지 않을 때 성립(참)한다.
//			if(k!=0) {
//			System.out.println("현재 3의 배수는 " + k + "입니다");
//			}
//		}
//		
		//가로 32cm, 세로 27cm의 1cm단위의 눈금종이가 있다
		//1줄씩 확인하며(가로로) 1cm 마다 움직이는 로봇이 있는데,
		//(가로를 모두 확인하면 세로 한 줄 넘어가서 가로 다시 확인)
		//가로 세로 길이 cm합이 3의 배수 일 경우
		//"가로 ?cm 더하기 세로 ?cm는 3의 배수입니다" 구문을 출력하시오
		//for문 안에 for문을 사용하고 if을 통해 조건을 확인하시오
		
		//i = 세로 , j = 가로
		for(int i = 1; i <=27; i ++) {
			for(int j = 1; j<=32; j++) {
				if((i+j)%3==0) {
					System.out.println("가로" + j + "cm 더하기" + "세로" + i + "cm는 3의 배수입니다.");
				}
			}
		}
		//String abcdSave : abcdSave 변수에는 String 문자열만 저장 가능 선언!
		//= methodTest(); : methodTest()에서 나오는 문자열을 대입연산자 좌측에 할당
		//= "abcd"; >> methodTest() 호출(불러오면)하면 "abcd" 문자열을 받음 
		
		String name = "김민기";
		//methodTest(name)는 name이라는 인자값(전달값)을 넣고 실행
		String abcdSave = methodTest(name);
		System.out.println("main method에서 실행!!" + abcdSave);
	}
	//public 접근제한자
	//static 유일한 메서드
	//void 리턴 값이 없음
	public static String methodTest(String inputName) {
		System.out.println("정상적 출력! " + inputName);
		return inputName;	
	}
	
	//2022 09 14 history
	//1. type은 선언부로써 변수에 들어갈 수 있는 타입을 선언하는 부분이며,
	//=(대입연산자) 우측 부분의 값이 좌측 변수에 할당되는 개념
	//2. for문(2중for문)의 초기식, 조건식, 증감식이 있고 {}코드가 조건식을 만족할 때 까지 실행
	//3. if문의 조건식은 성립(true)될 경우 if문 안에 {}코드가 실행
	//4. 매개변수는 다른 메서드에 특정 값을 전달하여 받는 매개체를 일컫음
	
}