package com.human.code20220923;

import java.util.Arrays;
import java.util.Scanner;

public class Java05_0001_saveNumberList {

	public static void main(String[] args) {
		// 20220923 history
		// 1. 메모리의 stack과 heap과 new연ㅅㄴ자
		// 2. 고정배열과 가변배열
		// 가변배열 : arrayList.get()과 set()과 remove()
		// 고정배열 : String[] NAME = new String[N]
		// String[N] = "TEXT";
		
		// 숫자 1부터 5까지 저장하는 고정배열을 만드시오
		// 고정배열 : 배열의 길이가 정해진 것
		// 배열 : 1,2,3,4,5
		
		//int타입으로 배열(여러개 담을 수 있는) []선언
		//이름은 intList
		//=(대입연산자) 우측 항에 int[]타입으로 새로 독립적으로(new) 생성
		//길이는 5 >> int[5];
//		int[] intList = new int[5];
		
		//메모리에 있는 intList 배열 변수를 가져다가
		//[0] 0번째 있는 배열 순서에 =(대입연산자)를 통해 1이라는 숫자를 할당(저장)
//		intList[0] = 1;
//		intList[1] = 2;
//		intList[2] = 3;
//		intList[3] = 4;
//		intList[4] = 5;
		
		// 숫자 1부터 5까지 저장하는 고정배열을 만드시오
		//A.length : 배열 A[]의 길이를 반환해주는 코드
//		for(int i=0; i<intList.length; i++) {
//			System.out.println(intList[i]);
//		}
		
		
		//숫자 1부터 100까지 저장하는 고정배열을 만드시오
		//int[] int타입으로 []배열 선언, 변수 이름은 intList_100
		//=(대입연산자) 우측에 int[100] int타입으로 100개를 넣을 수 있는
		//도구를 새로(new) 만들어서 intList_100변수에 할당(저장)
//		int[] intList_100 = new int[100];
		//for()반복문
		//int i = 0;
		//조건절 : i의 값은 intList_100.length(길이를 측정하는 도구)
		//길이보다 작을 때 까지 for문을 돌리겠다
		//i++ : 증감식 (후위연산자)
//		for(int i=0; i<intList_100.length; i++) {
//			//intList_100[i] : 배열의 i번째를 가져와서
//			//=(대입연산자)를 통해 i+1의 값을 저장
//			intList_100[i] = i+1;
//			System.out.println(intList_100[i]);	
//		}
		
		int saveNum = 0;
		int[] lottoNumList = new int[6];
		
		for(int i = 0; i<lottoNumList.length; i++) {
			saveNum = (int)(Math.random()*45)+1;
		for(int j = 0; j<i; j++) {
			if(saveNum==lottoNumList[j]) {
				i --;
			};
		}
		lottoNumList[i] = saveNum;
	}
		
		for(int i = 0; i<lottoNumList.length; i++) {
			System.out.println(lottoNumList[i]);
		}
			
		
		
		
		
		
		//0, 1, 2, 3
		//자료형(클래스) 변수이름 = new 자료형(클래스);
		//1. int, double과 같이 앞에 소문자이면 기본타입으로 변수 안에 값을 저장
		//2. String과 같은 앞의 대문자이면 같은 데이터일 경우 같은 메모리 주소값을 가짐
		//3. 단, new 라고 붙이면 독립적인 메모리 영역을 할당하여 사용
		//new 연산자와 리터럴 방식의 차이
		
		//int[] saveNumber = new int[4];
//		String testString = new String("김민기");
//		Scanner testScan = new Scanner(System.in);
//		
//		String testString_2 = new String("김민기");
//		String testString_3 = "김민기";
//		String testString_4 = "김민기";
//		
//		//System.identityHashCode() 메모리 주소를 반환해주는 메서드
//		//메모리 주소란 메모리영역을 알 수 있는 번지수(진짜 주소)
//		System.out.println(testString);
//		System.out.println(System.identityHashCode(testString));
//		System.out.println(System.identityHashCode(testString_2));
//		System.out.println(System.identityHashCode(testString_3));
//		System.out.println(System.identityHashCode(testString_4));
	}

}
