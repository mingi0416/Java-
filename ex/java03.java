package com.human.ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.human.dao.HumanArrayDao;
import com.human.dto.HumanDto;

public class java03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanArrayDao dao = new HumanArrayDao();
		
		dao.init();
		
		dao.select();
		HumanDto dto = new HumanDto("홍길동2", 32, 152.1, 
				LocalDateTime.parse("2000-02-03 00:00:00", 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		dao.insert(dto);
		dao.select();
		dao.update("홍길남", 50);
		dao.select();
		dao.delete(33);
		dao.select();
		
		
	}

}
