package com.human.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.human.dto.HumanDto;

public class HumanListDao {

	private ArrayList<HumanDto> dtos = new ArrayList<HumanDto>();

	public void init() {
		dtos.add(new HumanDto("홍길동", 30, 152.1,
				LocalDateTime.parse("2000-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
		dtos.add(new HumanDto("홍길남", 31, 156.4,
				LocalDateTime.parse("2001-02-03 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
		dtos.add(new HumanDto("홍길영", 30, 173.5,
				LocalDateTime.parse("2000-12-21 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))));
	}

	public void insert(HumanDto dto) {
		dtos.add(dto);
	}

	public void update(String name, int age) {
//		System.out.println("Update name, age");// 홍길남 50세로 변경
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getName().equals(name)) {
				dtos.get(i).setAge(age);
			}
		}
	}

	public void delete(int age) {
//		System.out.println("delete 나이 age이하 삭제");
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAge() < age) {
				dtos.remove(i);
				i--;
			}
		}
	}

	public ArrayList<HumanDto> select() {
		ArrayList<HumanDto> resultDtos = new ArrayList<HumanDto>(); 
		
		for(HumanDto dto:dtos) {
			resultDtos.add(new HumanDto(dto));
		}
		return resultDtos;
	}
	
	public ArrayList<HumanDto> select(double height) {
		//키가 155이상인 사람 출력
		ArrayList<HumanDto> resultDtos = new ArrayList<HumanDto>();
//		System.out.println("select height XXX 이상");
		for(HumanDto dto:dtos) {
			if(dto.getHeight()>height) {
				resultDtos.add(new HumanDto(dto));
			}
		}
		return resultDtos;
	}
	
	
	
}
