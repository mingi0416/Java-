package com.human.code20220915;

public class Java_03operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//산술연산자 +, -, *, /
		//부호연산자 음수, 양수
		//문자열연산자
//		String a = "김민기"+"학생";
//		System.out.println("김민기"+"학생");
//		//대입연산자
//		int b = 5;
//		System.out.println(b);
//		//기존에 있는 변수 b에 곱하기3을 하고
//		//변수 b에 대입연산자(=)로 할당(저장)
//		b *= 3;
//		System.out.println(b);
//		//증감연산자 i++
//		for(int i=1; i<4; i++) {}
//		//비교연산자 ==, !=, <=
//		//instance 객체비교연산자
//		//논리연산자
//		//! 반전, && 둘다 참, || 둘중에 하나 참
//		int check = 1;
//		//(check == 2) check변수의 값은 1이므로 2가 아님
//		//flase값에다가 ! 붙혀서 반전연산자로 true가 됨
//		if(!(check == 2)) {
//			System.out.println("check 출력");
//		}
//		//조건연산자 (삼항연산자)
//		//(check==1) 조건절로써 true와 flase를 확인
//		//조건절이 true(사실, 조건성립)이면 좌측 50값이 대입연산자 좌측 변수 check003에 할당
//		//(flase)일 경우 40이 좌측 변수 check003에 할당
//		int check003 = (check==1)? 50:40;
//		System.out.println(check003);
		
		int x = 1;
		int y = -1;
		//&&와 비교연산자(>, <) 중에 >, <가 우선순위이므로
		//x>0이 ture인지 flase인지를 먼저 확인하고
		//y<0이 ture인지 flase인지를 확인 한 뒤에
		//&&를 통해서 true/false값 출력
		//A && B는 A조건과 B조건이 모두 true이면 ture표시
		//&& = 그리고  || = 또는
		System.out.println(x>0 && y<0);
	}

}
