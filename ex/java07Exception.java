package com.human.ex;

import com.human.dao.HumanListDao;
import com.human.dto.HumanDto;
import com.human.util.UserInput;

public class java07Exception {
	
	public static void main(String[] args) {
	
		//예외처리
		//프로그램에 문제가 발생했을때 종료되지 않고 계속 동작하게 하려고 사용한다.
		//프로그램이 실행도중에 발생하는 예상치 못한 에러를 
		//처리해서 중간에 강제 종료되지 않고 정상종료되도록 
		//예외를 처리하는것을 의미한다.
		//try catch finally
		
		try {
//			System.out.println("db열기");
//			int num = UserInput.inputInt("입력");
//			System.out.println(num);
//			System.out.println("db닫기"); //항상 DB가 닫히는가?
			
//			Integer a = (Integer)new HumanDto();
//			HumanDto dto = new HumanDto();
//			HumanListDao dao = (HumanListDao)dto;
			//ClassCastException 자식을 부모로 강제 형변환할때 반생
			//ArrayIndexOutOfBoundsException 배열의 범위를 벗어났을때 발생
//			int[]a = new int[3];
//			a[3]=10;
			//NullPointerException
//			HumanDto dto = null;
//			dto.setName("park");
//			ArithmeticException
			System.out.println(10/0);
		
			
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());	
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());	
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("db닫기"); //항상 DB가 닫히는가?
		}
		System.out.println("프로그램 종료");
	
	}
}
