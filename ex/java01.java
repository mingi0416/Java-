package com.human.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.human.dto.HumanDto;

public class java01 {

	public static void main(String[] args) {
		//human테이블의 데이터 출력
		//1. 변수를 이용한 출력
//		String name = "홍길동"; int age = 30; double height=152.1;
//		LocalDateTime birthday;
		
		LocalDateTime nowTime=LocalDateTime.now();
//		System.out.println("nowTime : " + nowTime);
		//localdatetime -> string
		String parseString = nowTime.format(DateTimeFormatter.ofPattern
				("yyyy-MM-dd HH:mm:ss"));
//		System.out.println("parseString : " + parseString);
		
		//string -> localdatetime
//		LocalDateTime parseTime = LocalDateTime.parse(시간문자열, 시간문자열포멧);
		LocalDateTime parseTime = LocalDateTime.parse(parseString, 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		
//		System.out.println("parstTime : " + parseTime);
		
		//DB작업 이어서 하기
		//날짜만 처리하려면 simpleDateFormat을 사용하자
		String name = "홍길동"; int age = 30; double height=152.1;
		LocalDateTime birthday = LocalDateTime.parse("2000-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("생일 : " + birthday);
		System.out.println("생일 : " + birthday.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println();
		//2.여러개의 변수에 넣어서 처리하기
		
		String name1 = "홍길남"; int age1 = 31; double height1=156.4;
		LocalDateTime birthday1 = LocalDateTime.parse("2001-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("이름 : " + name1);
		System.out.println("나이 : " + age1);
		System.out.println("키 : " + height1);
		System.out.println("생일 : " + birthday1);
		System.out.println("생일 : " + birthday1.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println();
		
		String name2 = "홍길영"; int age2 = 30; double height2=173.5;
		LocalDateTime birthday2 = LocalDateTime.parse("2000-12-21 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("이름 : " + name2);
		System.out.println("나이 : " + age2);
		System.out.println("키 : " + height2);
		System.out.println("생일 : " + birthday2);
		System.out.println("생일 : " + birthday2.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));

		//클래스를 이용하여 관련있는 Human 데이터와 메소드를 합치기
		//데이터베이스의 데이터를 java에서 조작할때 dto, dao를 사용한다
		//dto 데이터베이스의 데이터를 저장하는 객체
		//dao 데이터베이스에 데이터를 조작할때 사용하는 객체
		
//		private String name = null;
////		private int age = 0;
//		private Integer age = null;
////		private double height = 0;
//		private Double height = null;
//		private LocalDateTime birthday = null;
		
		HumanDto dto1 = new HumanDto("홍길동", 23, 152.1, LocalDateTime.now());
		HumanDto dto2 = new HumanDto("홍길동", 24, 152.1, LocalDateTime.now());
		HumanDto dto3 = new HumanDto("홍길남", 23, 152.1, LocalDateTime.now());
		HumanDto dto4 = new HumanDto("홍길동", 23, 152.1, LocalDateTime.now());
		
		//ashcode와 equals가 없다면 모두 다르다고 나온다
		if(dto1.equals(dto2)) {
			System.out.println("dto1과 dto2는 같다");
		}else {
			System.out.println("dto1과 dto2는 다르다");
		}
		
		if(dto1.equals(dto3)) {
			System.out.println("dto1과 dto3는 같다");
		}else {
			System.out.println("dto1과 dto3는 다르다");
		}
		if(dto1.equals(dto4)) {
			System.out.println("dto1과 dto4는 같다");
		}else {
			System.out.println("dto1과 dto4는 다르다");
		}

		HumanDto hDto1 = new HumanDto("홍길동", 30, 152.1, 
				LocalDateTime.parse("2000-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		HumanDto hDto2 = new HumanDto("홍길남", 31, 156.4, 
				LocalDateTime.parse("2001-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		HumanDto hDto3 = new HumanDto("홍길영", 30, 173.5, 
				LocalDateTime.parse("2000-12-21 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		hDto1.myPrint();
		hDto2.myPrint();
		hDto3.myPrint();
		
		HumanDto myDto = new HumanDto();
		myDto.myAge=330;

		myDto.setAge(30);
		
		System.out.println(myDto.myAge);
		
	}

}
