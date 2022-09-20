package com.human.code20220920;

import java.util.Scanner;

public class Java05_randomAndEquals {

	public static void main(String[] args) {
		// 랜덤숫자를 출력하는 메서드 Math.random();의 결과는 소수점이기 때문에
		//double 타입 num 변수를 선언하고 0을 메모리에 저장
//		int num = 0;
//		//초기식 i=0; 조건식 i<10; 증감식 i++
//		for(int i=0; i<6; i++) {
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
//			num=(int)(Math.random()*45)+1;
//			System.out.println(num);
//		}

		
		Scanner scan = new Scanner(System.in);
		String inputData = "";
		for(;;) {
			System.out.println("값을 입력하시오!");
			inputData = scan.nextLine();
			//A.equals("B")
			//equals()메서드를 사용하여 A변수의 데이터(문자열)와
			//"B"문자를 비교해서 참이면(true)이면 {}코드 영역 실행
			//유사) == : 숫자비교
			if(inputData.equals("김민기")) {
				System.out.println("학생");
			}else if(inputData.equals("이민기")) {
				System.out.println("연예인");
			}else if(inputData.equals("송민기")) {
				System.out.println("가수");
			}else {
				System.out.println("다시 입력하세요!");
			}
		}
	}

}
