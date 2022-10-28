package com.human.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.IntStream;

import com.human.dto.HumanDto;

public class java02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터 선언
		HumanDto[] dtos = new HumanDto[10];
		int totalCount=0;
		//객체의 주소를 저장할 수 있는 공간 10개가 생김
		//실제 객체를 저장할 수 있는 공간은 없음
		
		//데이터 초기화 init
		dtos[totalCount++] = new HumanDto("홍길동", 30, 152.1, 
				LocalDateTime.parse("2000-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길남", 31, 156.4, 
				LocalDateTime.parse("2001-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dtos[totalCount++] = new HumanDto("홍길영", 30, 173.5, 
				LocalDateTime.parse("2000-12-21 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		//select
		System.out.println("Select");
		for(int i=0; i<totalCount; i++) {
			dtos[i].myPrint();
		}
		//키가 155이상인 사람 출력
		System.out.println("키가 155 이상인 사람");
		for(int i=0; i<totalCount; i++) {
			if(dtos[i].getHeight()>155) {
				dtos[i].myPrint();
			}
		}
		
		//insert
		
		dtos[totalCount++]= new HumanDto("홍길도", 42, 183.5, 
				LocalDateTime.parse("2022-12-24 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		//update
		System.out.println("Update name, age");//홍길남 50세로 변경
		for(int i=0; i<totalCount; i++) {
			if(dtos[i].getName().equals("홍길남")) {
				dtos[i].setAge(50);
				dtos[i].myPrint();
			} 
		}
		
		//delete 나이가 35보다 작은 사람 삭제
		System.out.println("나이가 35보다 작은 사람 삭제");
		for(int i=0; i<totalCount; i++) {
			if(dtos[i].getAge()<35) {
				for(int j=i; j<totalCount-1; j++) {
					dtos[j]=dtos[j+1];
				}
				totalCount--;
			} 	
		}
		for(int i=0; i<totalCount; i++) {
			dtos[i].myPrint();
		}
		
	}

}
