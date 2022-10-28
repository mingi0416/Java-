package com.human.ex;

import com.human.dto.HumanDto;
import com.human.util.UserInput;

public class java08Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			HumanDto dto = new HumanDto();
			
			String name = UserInput.inputString("이름");
			dto.setName(name);
			dto.setAge(UserInput.inputInt("나이"));
			dto.setHeight(UserInput.inputDouble("키"));
			dto.setBirthday(UserInput.inputLocalDateTime("생일"));
			
			dto.myPrint();
		}catch(Exception e){
			e.printStackTrace();
		}
		//Human 관리 프로그램 구현
		
	}
}
