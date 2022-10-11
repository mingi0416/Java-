package com.human.ex20221011;

import java.util.Scanner;

public class Practice {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//1번문제
		int x = 10;
		int y = 4;
		double result1 = (double)x/y;
		System.out.println((int)result1);
		System.out.println(result1);
		System.out.println("==================");
		
		//2번문제
		double a = 3.5;
		double b = 4.7;
		double result = a+(int)b;
		System.out.println(result);
		System.out.println("==================");
		
		//3번문제
		String c = "3.4";
		String d = "4";
		int result2 = (int)Double.parseDouble(c)*Integer.parseInt(d);
		System.out.println(result2);
		System.out.println("==================");
		
		//4번문제
		String e = "10";
		int f = 3;
		double g = 4.5;
		String result3 = e + (int)(f*g);
		System.out.println(result3);
		System.out.println("==================");
		
		//5번문제
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if((2*x)+(4*y)==10) {
					System.out.println("x : "+x);
					System.out.println("y : "+y);
				}
			}
		}
		System.out.println("==================");
		
		//6번문제
		System.out.println("첫번째 숫자를 입력하세요");
		int a6 = sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 숫자를 입력하세요");
		int b6 = sc.nextInt();
		sc.nextLine();
		
		if(a6>b6) {
			System.out.println(a6-b6);
		}else {
			System.out.println(b6-a6);
		}
		System.out.println("==================");
		
		//7번문제
		System.out.println("윳놀이 게임입니다. 0 또는 1을 입력하세요");
		int a7 = sc.nextInt();
		sc.nextLine();
		int b7 = sc.nextInt();
		sc.nextLine();
		int c7 = sc.nextInt();
		sc.nextLine();
		int d7 = sc.nextInt();
		sc.nextLine();
		int e7 = a7+b7+c7+d7;
		
		if(e7==4) {
			System.out.println("입력 "+a7+b7+c7+d7);
			System.out.println("결과 : 모");
		}
		if(e7==3) {
			System.out.println("입력 "+a7+b7+c7+d7);
			System.out.println("결과 : 걸");
		}
		if(e7==2) {
			System.out.println("입력 "+a7+b7+c7+d7);
			System.out.println("결과 : 개");
		}
		if(e7==1) {
			System.out.println("입력 "+a7+b7+c7+d7);
			System.out.println("결과 : 도");
		}
		if(e7==0) {
			System.out.println("입력 "+a7+b7+c7+d7);
			System.out.println("결과 : 윳");
		}
		System.out.println("==================");

		//8번문제
		System.out.println("숫자를 입력하세요. 입력한 숫자만큼 *이 출력됩니다");
		int a8 = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=a8; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("==================");
		
		//9번문제
		System.out.println("숫자를 입력하시면 입력한 숫자의 약수가 나옵니다.");
		int a9 = sc.nextInt();
		sc.nextLine();
		for(x=1; x<=a9; x++) {
			if(a9%x==0) {
				System.out.println(a9+"의 약수는 : "+x);
			}
		}
		System.out.println("==================");
		
		//10번문제
		System.out.println("별찍기 프로그램입니다. 원하시는 숫자를 입력해주세요");
		int a10 = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=a10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=a10-1; i++) {
			for(int j=a10-1; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
