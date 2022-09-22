package com.human.code20220922;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java04_0008_groupProject_calculator1 {

	//main(); 자바 프로그램의 가장 처음 시작되는 메서드 (시작점이자 끝)
	public static void main(String[] args) {
		
		//20220922 history
		//1. 메모리와 메서드 호출 개념
		//2. 
		
		// 사칙연산 계산기 method ver
		// + / - / * / /(나누기) 연산을 하는 메서드를 만드시오
		//단, 하나의 기능을 하는 메서드를 다수 만들어서
		//복합적으로 구성하시오
		Scanner scan = new Scanner(System.in);
		double temp = 0;
		double temp1 = 0;
		String temp_oper = "";
		DecimalFormat format = new DecimalFormat();
		format.applyLocalizedPattern("#.###");
		view_welcome();
		
		for(;;) {
		view_numberPlz();
		double num1 = scan.nextDouble();
		scan.nextLine();
		
		view_stringPlz();
		temp_oper = scan.nextLine();
		
		if(!temp_oper.equals ("r")) {
		view_numberPlz();
		double num2 = scan.nextDouble();
		scan.nextLine();
		
		temp = calc_start(num1, temp_oper, num2);
		System.out.println("계산결과 : " +format.format(temp));
		}else if(temp_oper.equals("r")) {
			temp1 = calc_start1(num1, temp_oper);
			System.out.println("계산결과 : " + format.format(temp1));
		}
		view_end();
		int endnum = scan.nextInt();
		if(endnum == 1 ) {
			break;
		}
	}
}
		//int intA : int타입으로 intA 변수명을 메모리에 선언
		//=(대입연산자) 우측 항의 20이라는 숫자를
		//좌측 항 intA변수에 할당(저장)
//		int intA = scan.nextInt();
		//하단에 있는 view()메서드를 호출하여 실행
		
		//scan이라는 변수를 메모리에서 불러옴
		//scan이 갖고 있는 nextInt();메서드를 실행
		//실행하면 키보드에서 입력받은 숫자를 intA에 할당(저장)
//		intA = scan.nextInt();
//		scan.nextLine();
//		String oper = scan.nextLine();
//		
//		if(oper.equals("*20")) {
//			intA = calcA20(intA);
//		}else if(oper.equals("-10")) {
//			intA = calcB10(intA);
//		}
		
		
		//calc(intA); intA 변수를 메모리에서 받아오고,
		//calc(); 메서드의 인자값으로 넣음,
		//calc(intA); 메서드 실행
		//실행 결과 값(retrun)을
		//=(대입연산자) 좌측 항의 intA 변수에 할당(저장)
//		intA = calcA20(intA);
//		System.out.println(intA);


	
	private static void view_welcome() {
		System.out.println("안녕하세요");
		System.out.println("계산기입니다");
		System.out.println("=================");
		System.out.println("첫 번째 숫자를 입력하고");
		System.out.println("연산자를 입력하고(+, -, *, /, ^, r)");
		System.out.println("두 번째 숫자를 입력하면");
		System.out.println("결과가 출력됩니다");
		System.out.println("=================");
	}
	
	private static void view_end() {
		System.out.println("프로그램을 종료하시겠습니까?");
		System.out.println("1. 예 / 2. 아니요");
	}
	
	private static void view_numberPlz() {
		System.out.println("숫자를 입력하시오");	
	}
	
	private static void view_stringPlz() {
		System.out.println("문자를 입력하시오");	
	}

	private static double calc_start(double A, String B, double C) {
		double result = 0;
		if(B.equals("+")) {
			result = calc_plus(A,C);	
		}else if(B.equals("-")) {
			result = calc_minus(A,C);
		}else if(B.equals("*")) {
			result = calc_multiplication(A,C);
		}else if(B.equals("/")) {
			result = calc_division(A,C);
		}else if(B.equals("^")) {
			result = calc_square(A,C);
		}
		return result;
	}
	
	private static double calc_start1(double num1, String B) {
		double result = 0;
		if(B.equals("r")) {
			result = calc_sqrt(num1);
		}
		return result;
	}
	
	private static double calc_plus(double a, double c) {
		return a+c;
	}
	
	private static double calc_minus(double A, double B) {
		return A-B;
	}
	
	private static double calc_multiplication(double A, double B) {
		return (double) A*B;
	}
	
	private static double calc_division(double A, double B) {
		return (double) A/B;
	}
	
	private static double calc_square(double A, double B) {
		return Math.pow(A, B);
	}
	
	private static double calc_sqrt(double A) {
		return Math.sqrt(A);
	}
	
	
	//calc(); 실행을 하면 아래 메서드가 실행
	//(int intA) 인자값으로 받은 데이터를 intA라는 이름으로 설정
	//return은 메서드 실행이 종료되면 반환해주는 값
//	public static int calcA20(int intABCD) {
//		return intABCD * 20;
//	}
//	
//	public static int calcB10(int intABCD) {
//		return intABCD - 10;
//	}
}
