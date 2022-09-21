package com.human.code20220921;

import java.util.Scanner;

public class Java80_0001_groupProject_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*문자열자르기
		// 특정 값을 입력하면 자동으로 계산해주는 계산기를 만드시오
		// ex) 12 입력하고, + 입력하고, 30 입력하면
		// 42를 출력할것
		
		//계산기 자동인식 시스템을 구축하려고 합니다
		//처음에 "본 시스템은 숫자와 연산자를 반복적으로 입력 받습니다.
		//=를 입력하면 입력이 완료됩니다"
		//출력이 되고,
		//시작을 하면 "숫자를 입력하시오" 두 번째에는 "연산자를 입력하시오"를
		//계속 반복합니다 (반복문)
		//if문과 for문, ==과 equals()와 변수 등등을
		//사용하여 본 시스템을 구축하시오
		
		//키보드 값을 입력받는 Scanner 도구 만들기
		Scanner scan = new Scanner(System.in);
		
		//숫자 입력받는 변수
		int input_num = 0;
		//연산자 입력받는 변수
		String input_calc = "";
		
		System.out.println("본 시스템은 숫자와 연산자를 반복적으로 입력받습니다," + " =를 입력하면 입력이 완료됩니다.");
		int temp = 0; //임시 값 저장소
		for(;;) {
			System.out.println("숫자를 입력하시오");
			input_num = scan.nextInt(); //scan에 있는 buffer를 비움
			temp = input_num;
			
			scan.nextLine();
			System.out.println("연산자를 입력하시오");
			input_calc = scan.nextLine();
			
			System.out.println("숫자를 입력하시오");
			input_num = scan.nextInt();
			scan.nextLine();
			
			if(input_calc.equals("+")) {
				temp +=input_num;
				break;
			}else if(input_calc.equals("-")) {
				temp -= input_num;
				break;
			}else if(input_calc.equals("*")) {
				temp *= input_num;
			}else if(input_calc.equals("/")) {
				temp /= input_num;
			}
			
			if(input_calc.equals("=")) {
				System.out.println(temp);
				break;
			}
//			System.out.println("연산자를 입력하시오");
//			input_calc = scan.nextLine();
			
//			if(input_calc.equals("=")) {
//				break;
//			}
		}
	}

}
