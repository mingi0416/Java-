package com.human.code20220921;

import java.util.Scanner;

public class Java05_randomAndEquals2 {

	public static void main(String[] args) {
		
		//랜덤숫자 1~10까지 주에 3개의 숫자를 뽑습니다.
		//그 숫자 중에 가장 큰 수를 출력하시오
		int xnum = 0;
		int xnum1 = 0;
		int xnum2 = 0;
		int xnum3 = 0;
		for(int i=0; i<3; i++) {
			xnum = (int)(Math.random()*10)+1;
			if(xnum1==0) {
				xnum1=xnum;
			}else if(xnum2==0) {
				xnum2=xnum;
			}else if(xnum3==0) {
				xnum3=xnum;
			}	
		}
		
		
		System.out.println("xnum1 : " + xnum1 +" | xnum2 : " + xnum2 +" | xnum3 : " + xnum3);
		
		if(xnum1>xnum2 && xnum1>xnum3) {
			System.out.println(xnum1);
		}else if(xnum2>xnum1 && xnum2>xnum3) {
			System.out.println(xnum2);
		}else if(xnum3>xnum1 && xnum3>xnum2) {
			System.out.println(xnum3);
		}else{
			System.out.println("가장 큰 수가 2개가 있습니다. 다시 돌려주세요");
		}
		
		// 랜덤숫자를 출력하는 메서드 Math.random();의 결과는 소수점이기 때문에
		//double 타입 num 변수를 선언하고 0을 메모리에 저장
//		int num = 0;
//		int Exnum = 0;
//		int lotto1 = 0;
//		int lotto2 = 0;
//		int lotto3 = 0;
//		int lotto4 = 0;
//		int lotto5 = 0;
//		int lotto6 = 0;
//		//초기식 i=0; 조건식 i<10; 증감식 i++
//		for(int i=0; i<6; i++) {
//			Exnum = (int)(Math.random()*45)+1;
//			System.out.println(Exnum);
//			
//			if(lotto1==0) {
//				//lotto1 변수에
//				//=(대입연산자)를 통해서
//				//Exnum변수의 값을 가져다가 할당(저장)
//				//Exnum 변수에 예를 들어 23이라는 숫자가 있다고 가정한다면,
//				//=(대입연산자) 우측부터 시작하여
//				//Exnum변수를 메모리에서 불러다가 값을 가져온다
//				//23이라는 숫자가 가져와져서 =(대입연산자) 좌측에 있는 lotto1 이라는 변수에 할당(저장)
//				lotto1 = Exnum;
//			}else if(lotto2 ==0) {
//				lotto2 = Exnum;
//			}else if(lotto3 ==0) {
//				lotto3 = Exnum;
//			}else if(lotto4 ==0) {
//				lotto4 = Exnum;
//			}else if(lotto5 ==0) {
//				lotto5 = Exnum;
//			}else if(lotto6 ==0) {
//				lotto6 = Exnum;
//			}
//			System.out.println("로또 번호는 ");
//			System.out.println(lotto1+"/"+lotto2+"/"+lotto3+"/");
//			System.out.println(lotto4+"/"+lotto5+"/"+lotto6+"/");
//			//0.0보다 크거나 같고 1.0보다 작은 값 출력
//			//0.0~0.999 곱하기 10, 100하면
//			//0.0~9.999, 0.0~99.999
//			//메모리 num이라는 변수에다가 Math.random(0메서드로 실행한 값을
//			//저장
//			//Math.random(); 소수점 표기한
//			//0.0보다 크거나 같고 1.0보다 작은 값 출력(0.99999...)
//			//(int)로 형변환(캐스팅)을 하면 소수점이 다 짤려서 출력 = 0
//			//num이 double타입이기 때문에 0을 0.0으로 형변환(캐스팅)하여
//			//num에 저장
//
////			num=(int)(Math.random()*45)+1;
//			
//		}

		
//		Scanner scan = new Scanner(System.in);
//		String inputData = "";
//		for(;;) {
//			System.out.println("값을 입력하시오!");
//			inputData = scan.nextLine();
//			//A.equals("B")
//			//equals()메서드를 사용하여 A변수의 데이터(문자열)와
//			//"B"문자를 비교해서 참이면(true)이면 {}코드 영역 실행
//			//유사) == : 숫자비교
//			if(inputData.equals("김민기")) {
//				System.out.println("학생");
//			}else if(inputData.equals("이민기")) {
//				System.out.println("연예인");
//			}else if(inputData.equals("송민기")) {
//				System.out.println("가수");
//			}else {
//				System.out.println("다시 입력하세요!");
//			}
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		String result = "";
//		String study = "";
//		
//	for(;;) {
//		System.out.println("입력하세요");
//		study = scanner.nextLine();
//		//study.euals("비교문자열")
//		//study는 String타입으로
//		//.equals() 메서드를 사용해서 문자열 값을 비교
//		if(study.equals("a")) {
//			System.out.println("test");
//		}
//		
//		if(study.equals("이것은 자바다")) {
//			result = "자바 공부 시작!";
//		}else if (study.equals("Jquery")) {
//			result = "Jquery 공부 시작!";
//		}else if (study.equals("SQL")) {
//			result = "Database 공부 시작!";
//		}else if (study.equals("HTMLCSS")) {
//			result = "HTML / CSS 공부 시작!";
//		}else if (study.equals("Spring")) {
//			result = "SpringFreamwork 공부 시작 !";
//		}
//		System.out.println(result);
//		}
	}

}
